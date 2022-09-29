package com.votingManagementSystem.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.votingManagementSystem.entity.CandidateEntity;
import com.votingManagementSystem.exception.CandidateNotFoundException;
import com.votingManagementSystem.repository.CandidateRepository;

@Service
public class CandidateServiceImpl implements CandidateService{

	@Autowired
	private CandidateRepository candidateRepo;
	
	@Override
	public List<CandidateEntity> getAllCandidate() {
		return candidateRepo.findAll();
	}

	@Override
	public Optional<CandidateEntity> getCandidate(int id) throws CandidateNotFoundException {
		try {
			Optional<CandidateEntity> candidateData = candidateRepo.findById(id);
			if(!candidateData.isEmpty()) {
				return candidateRepo.findById(id);
			}
			else {
				throw new CandidateNotFoundException("Candidate Data not found");
			}
		}
		catch(Exception e){
			throw new CandidateNotFoundException("Candidate Data not found");
		}	
	}

	@Override
	public CandidateEntity addCandidate(CandidateEntity candidateEntity) {
		// TODO Auto-generated method stub
		return candidateRepo.save(candidateEntity);
	}

	@Override
	public Optional<CandidateEntity> deleteCandidate(int id) throws CandidateNotFoundException {

		try {
			Optional<CandidateEntity> candidateData = candidateRepo.findById(id);
			if(!candidateData.isEmpty()) {
				candidateRepo.deleteById(id);
				return candidateData;
			}
			else {
				throw new CandidateNotFoundException("Candidate Data not found");
			}
		}
		catch(Exception e){
			throw new CandidateNotFoundException("Candidate Data not found");
		}
	}

	@Override
	public CandidateEntity updateCandidate(int id, CandidateEntity candidateEntity) throws CandidateNotFoundException {
		try {
			Optional<CandidateEntity> candidateData = candidateRepo.findById(id);
			if(!candidateData.isEmpty()) {
				candidateEntity.setId(id);
				return candidateRepo.save(candidateEntity);
			}
			else {
				throw new CandidateNotFoundException("Candidate Data not found");
			}
		}
		catch(Exception e){
			throw new CandidateNotFoundException("Candidate Data not found");
		}	
	}
}
