package com.votingManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.votingManagementSystem.entity.AdminEntity;

@Repository
public interface AdminRepository  extends JpaRepository<AdminEntity, String> {
	
	}
