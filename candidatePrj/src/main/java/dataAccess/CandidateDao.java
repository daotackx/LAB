package dataAccess;

import java.util.ArrayList;
import model.Candidate;
import model.Experience;
import model.Fresher;
import model.Internship;
import common.Validation;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author THAO LINH
 */
public class CandidateDao {
    private static CandidateDao instance = null;

    public static CandidateDao Instance() {
        if(instance == null){
            synchronized (CandidateDao.class){
                if(instance == null){
                    instance = new CandidateDao();
                }
            }
        }
        return instance;
    }
    
    
     
     public void addCandidate(ArrayList<Candidate> candidateList, int type) {
        while (true) {
             int id = Validation .getInt("Input id");
            String firstName = Validation.getString("Input first name");
            String lastName = Validation.getString("Input last name");
            int birthDate = Validation.checkBirthDate("Input a number with length is 4 character");
            String address = Validation.getString("Input address");
            String phone = Validation.inputPhoneNumber("Input a phonenumber with minimum 10 characters");
            String email = Validation.inputEmail("Input a email with format <account name>@<domain");
            Candidate candidate = new Candidate(id, firstName, lastName, birthDate, address, phone, email, type);
            switch (type) {
                case 0 ->
                    addExperience(candidateList, candidate);
                case 1 ->
                    addFresher(candidateList, candidate);
                case 2 ->
                    addInternship(candidateList, candidate);
                default ->
                    throw new AssertionError();
            }
            String in = Validation.inputYN("Do you want to continue(Y/N): ");
            if (!in.equalsIgnoreCase("y")) {
                break;
            }
        }

    }

    public void addExperience(ArrayList<Candidate> candidateList, Candidate candidate) {
        int expInYear = Validation.checkExpYear("Input a number from 0 to 100");
        String proSkill = Validation.getString("Input pro skill");
        Candidate experience = new Experience(candidate.getId(), candidate.getFirstName(), candidate.getLastName(), candidate.getBirthDate(), candidate.getAddress(), candidate.getPhone(), candidate.getEmail(), candidate.getTypeCandidate(), expInYear, proSkill);
        candidateList.add(experience);
    }

    public void addInternship(ArrayList<Candidate> candidateList, Candidate candidate) {
        String major = Validation.getString("Input major");
        String semester = Validation.getString("Input semester");
        String universityName = Validation.getString("Input name of university");
        Internship internship = new Internship(candidate.getId(), candidate.getFirstName(), candidate.getLastName(), candidate.getBirthDate(), candidate.getAddress(), candidate.getPhone(), candidate.getEmail(), candidate.getTypeCandidate(), major, semester, universityName);
        candidateList.add(internship);
    }

    public void addFresher(ArrayList<Candidate> candidateList, Candidate candidate) {
        String graduationDate = Validation.getString("Input date of graduation");
        String graduationRank = Validation.checkRankGraduation("Input rank of graduation");
        String education = Validation.getString("Input education");
        Fresher fresher = new Fresher(candidate.getId(), candidate.getFirstName(), candidate.getLastName(), candidate.getBirthDate(), candidate.getAddress(), candidate.getPhone(), candidate.getEmail(), candidate.getTypeCandidate(), graduationDate, graduationRank, education);
        candidateList.add(fresher);
    }

    public void printCandidate(ArrayList<Candidate> candidateList) {
        System.out.println("EXPERIENCE CANDIDATE");
        System.out.println("---------------");
        for (Candidate o : candidateList) {
            if (o instanceof Experience) {
                System.out.println(o.getFirstName() + " " + o.getLastName());
            }
        }

        System.out.println("FRESHER CANDIDATE");
        System.out.println("---------------");
        for (Candidate o : candidateList) {
            if (o instanceof Fresher) {
                System.out.println(o.getFirstName() + " " + o.getLastName());
            }

        }
        System.out.println("INTERN CANDIDATE");
        System.out.println("---------------");
        for (Candidate o : candidateList) {
            if (o instanceof Internship) {
                System.out.println(o.getFirstName() + " " + o.getLastName());
            }
        }
    }

    public void search(ArrayList<Candidate> candidateList) {
        Scanner sc = new Scanner(System.in);
        printCandidate(candidateList);
        ArrayList<Candidate> findCandidates = new ArrayList<>();
        String name = Validation.getString("Input candidate name(First name or last name): ");
        System.out.println("Input type of candidate: ");
        int typeCandidate = Integer.parseInt(sc.nextLine());
        for (Candidate o : candidateList) {
            if ((o.getFirstName().contains(name) || o.getLastName().contains(name)) && typeCandidate == o.getTypeCandidate()) {
                findCandidates.add(o);
            }
        }
        for (Candidate o : findCandidates) {
            System.out.println(o.toString());
        }
    }
}
