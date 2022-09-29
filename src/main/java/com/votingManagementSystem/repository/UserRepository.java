package com.votingManagementSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.votingManagementSystem.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer>{
	

}
