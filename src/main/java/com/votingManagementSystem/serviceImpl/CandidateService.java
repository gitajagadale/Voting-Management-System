package com.votingManagementSystem.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.votingManagementSystem.entity.CandidateEntity;
import com.votingManagementSystem.exception.CandidateNotFoundException;
@Service
public interface CandidateService {

public List<CandidateEntity> getAllCandidate();
	
	public Optional<CandidateEntity> getCandidate(int id) throws CandidateNotFoundException;
	
	public CandidateEntity addCandidate(CandidateEntity candidateEntity);
	
	public Optional<CandidateEntity> deleteCandidate(int id) throws CandidateNotFoundException;
	
	public CandidateEntity updateCandidate(int id, CandidateEntity candidateEntity) throws CandidateNotFoundException;
}
