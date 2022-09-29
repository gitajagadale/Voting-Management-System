package com.votingManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.votingManagementSystem.entity.ElectionEntity;

public interface ElectionRepository  extends JpaRepository<ElectionEntity, Integer>  {

}
