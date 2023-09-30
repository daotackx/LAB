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
import repository.CandidateRepository;
import repository.ICandidateRepository;
import view.Menu;

/**
 *
 * @author THAO LINH
 */
public class CandidateController extends Menu<String> {
    
    private ICandidateRepository candidateRepository;
    static String[] op = {"Experience", "Fresher", "Internsip", "Search", "Exit"};
    ArrayList<Candidate> candidateList;

    public CandidateController() {
        super("Candidate Menu", op);
        candidateRepository = new CandidateRepository();
        candidateList = new ArrayList<>();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1: {
                candidateRepository.addCandidate(candidateList,0);
                break;
            }
            case 2: {
                candidateRepository.addCandidate(candidateList,1);
                break;
            }
            case 3: {
                candidateRepository.addCandidate(candidateList,2);
                break;
            }
            case 4: {
                candidateRepository.searchCandidate(candidateList);
                break;
            }
            case 5:
                System.exit(0);
            default:
                System.out.println("Please, enter again!");
        }
    }

    

    
}
