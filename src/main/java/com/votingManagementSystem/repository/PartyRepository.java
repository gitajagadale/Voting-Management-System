package com.votingManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.votingManagementSystem.entity.PartyEntity;

@Repository
public interface PartyRepository extends JpaRepository<PartyEntity,Integer>{

}
