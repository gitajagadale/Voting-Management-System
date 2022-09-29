package com.votingManagementSystem.serviceImpl;

import java.util.List;
import java.util.Optional;

import com.votingManagementSystem.entity.ElectionEntity;
import com.votingManagementSystem.exception.ElectionNotFoundException;

public interface ElectionService {

	List<ElectionEntity> getAllElection();

	Optional<ElectionEntity> getElection(int id) throws ElectionNotFoundException;

	ElectionEntity updateElection(int id, ElectionEntity election) throws ElectionNotFoundException;

	ElectionEntity addElection(ElectionEntity election);

	Optional<ElectionEntity> deleteElection(int id) throws ElectionNotFoundException;


}
