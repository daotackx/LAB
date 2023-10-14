package dataAccess;

import java.util.ArrayList;
import model.Candidate;
import model.Experience;
import model.Fresher;
import model.Internship;
import common.Validation;

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
    
    Validation va = new Validation();
    
     
     public void addCandidate(ArrayList<Candidate> candidateList, int type) {
        while (true) {
             int id = va .getInt("Enter id");
            String firstName = va.getString("Enter first name");
            String lastName = va.getString("Enter last name");
            int birthDate = va.checkBirthDate("Enter birth date");
            String address = va.getString("Enter address");
            String phone = va.inputPhoneNumber("Enter a phone number");
            String email = va.inputEmail("Enter a email");
            Candidate candidate = new Candidate(id, firstName, lastName, birthDate, address, phone, email, type){
             };
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
            String in = va.inputYN("Do you want to continue(Y/N): ");
            if (!in.equalsIgnoreCase("y")) {
                break;
            }
        }

    }

    public void addExperience(ArrayList<Candidate> candidateList, Candidate candidate) {
        int expInYear = va.checkExpYear("Enter number of experience years");
        String proSkill = va.getString("Enter pro skill");
        Candidate experience = new Experience(candidate.getId(), candidate.getFirstName(), candidate.getLastName(), candidate.getBirthDate(), candidate.getAddress(), candidate.getPhone(), candidate.getEmail(), candidate.getTypeCandidate(), expInYear, proSkill);
        candidateList.add(experience);
    }

    public void addInternship(ArrayList<Candidate> candidateList, Candidate candidate) {
        String major = va.getString("Enter major");
        String semester = va.getString("Enter semester");
        String universityName = va.getString("Enter name of university");
        Internship internship = new Internship(candidate.getId(), candidate.getFirstName(), candidate.getLastName(), candidate.getBirthDate(), candidate.getAddress(), candidate.getPhone(), candidate.getEmail(), candidate.getTypeCandidate(), major, semester, universityName);
        candidateList.add(internship);
    }

    public void addFresher(ArrayList<Candidate> candidateList, Candidate candidate) {
        String graduationDate = va.getString("Enter date of graduation");
        String graduationRank = va.checkRankGraduation("Enter rank of graduation");
        String education = va.getString("Enter education");
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
        printCandidate(candidateList);
        ArrayList<Candidate> findCandidates = new ArrayList<>();
        String name = va.getString("Enter candidate name(First name or last name): ");
        int typeCandidate = va.getIntLimit("Enter type of candidate",0,2);
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
