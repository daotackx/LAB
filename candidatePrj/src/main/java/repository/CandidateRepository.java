/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import dataAccess.CandidateDao;
import java.util.ArrayList;
import java.util.List;
import model.Candidate;

/**
 *
 * @author THAO LINH
 */
public class CandidateRepository implements ICandidateRepository {

    private final List<Candidate> candidateList;

    public CandidateRepository() {
        this.candidateList = new ArrayList<>();
    }

    @Override
    public void addCandidate(ArrayList<Candidate> candidateList, int type) {
        CandidateDao.Instance().addCandidate(candidateList, type);
    }

    @Override
    public void updateCandidate(Candidate candidate) {
        for (int i = 0; i < candidateList.size(); i++) {
            if (candidate.getId() == candidateList.get(i).getId()) {
                candidateList.set(i, candidate);
                break;
            }
        }
    }

    @Override
    public void deleteCandidate(int candidateId) {
        candidateList.removeIf(candidate -> candidate.getId() == candidateId);
    }

    @Override
    public void searchCandidate(ArrayList<Candidate> candidateList) {
        CandidateDao.Instance().search(candidateList);
    }

    @Override
    public List<Candidate> getAllCandidates() {
        return candidateList;
    }

    @Override
    public Candidate getCandidateById(int candidateId) {
        for (Candidate candidate : candidateList) {
            if(candidate.getId() == candidateId){
                return candidate;
            }
        }
        return null;
    }

}
