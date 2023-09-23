/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Validation;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;
import model.Candidate;
import model.Experience;
import model.Fresher;
import model.Internship;
import view.Menu;

/**
 *
 * @author THAO LINH
 */
public class Program extends Menu<String> {

    static String[] opsList = {"Experience", "Fresher", "Internsip", "Search", "Exit"};
    ArrayList<Candidate> candidateList;
    Validation validation = new Validation();
    Scanner sc = new Scanner(System.in);

    public Program() {
        super("Candidate Menu", opsList);
        candidateList = new ArrayList<>();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1: {
                addCandidate(0);
                break;
            }
            case 2: {
                addCandidate(1);
                break;
            }
            case 3: {
                addCandidate(2);
                break;
            }
            case 4: {
                printCandidate(candidateList);
                search(candidateList);
                break;
            }
            case 5:
                System.exit(0);
            default:
                System.out.println("Please, enter again!");
        }
    }

    public void addCandidate(int type) {
        while (true) {
            int id = validation.getInt("Input id");
            String firstName = validation.getString("Input first name");
            String lastName = validation.getString("Input last name");
            int birthDate = validation.checkBirthDate("Input a number with length is 4 character");
            String address = validation.getString("Input address");
            String phone = validation.inputPhoneNumber("Input a phonenumber with minimum 10 characters");
            String email = validation.inputEmail("Input a email with format <account name>@<domain");
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
            String in = validation.inputYN("Do you want to continue(Y/N): ");
            if (!in.equalsIgnoreCase("y")) {
                break;
            }
        }

    }

    public void addExperience(ArrayList<Candidate> candidateList, Candidate candidate) {
        int expInYear = validation.checkExpYear("Input a number from 0 to 100");
        String proSkill = validation.getString("Input pro skill");
        Candidate experience = new Experience(candidate.getId(), candidate.getFirstName(), candidate.getLastName(), candidate.getBirthDate(), candidate.getAddress(), candidate.getPhone(), candidate.getEmail(), candidate.getTypeCandidate(), expInYear, proSkill);
        candidateList.add(experience);
    }

    public void addInternship(ArrayList<Candidate> candidateList, Candidate candidate) {
        String major = validation.getString("Input major");
        String semester = validation.getString("Input semester");
        String universityName = validation.getString("Input name of university");
        Internship internship = new Internship(candidate.getId(), candidate.getFirstName(), candidate.getLastName(), candidate.getBirthDate(), candidate.getAddress(), candidate.getPhone(), candidate.getEmail(), candidate.getTypeCandidate(), major, semester, universityName);
        candidateList.add(internship);
    }

    public void addFresher(ArrayList<Candidate> candidateList, Candidate candidate) {
        String graduationDate = validation.getString("Input date of graduation");
        String graduationRank = validation.checkRankGraduation("Input rank of graduation");
        String education = validation.getString("Input education");
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
        ArrayList<Candidate> findCandidates = new ArrayList<>();
        System.out.println("Input candidate name(First name or last name): ");
        String name = sc.nextLine();
        System.out.println("Input type of candidate");
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
