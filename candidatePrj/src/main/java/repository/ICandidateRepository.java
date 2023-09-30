/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.ArrayList;
import java.util.List;
import model.Candidate;

/**
 *
 * @author THAO LINH
 */
public interface ICandidateRepository {

    void addCandidate(ArrayList<Candidate> candidateList, int type);

    void updateCandidate(Candidate candidate);

    void deleteCandidate(int candidateId);

    void searchCandidate(ArrayList<Candidate> candidateList);

    List<Candidate> getAllCandidates();

    Candidate getCandidateById(int candidateId);
}
