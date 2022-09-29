package com.votingManagementSystem.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.votingManagementSystem.entity.AdminEntity;
import com.votingManagementSystem.exception.AdminNotFoundException;
import com.votingManagementSystem.repository.AdminRepository;
import com.votingManagementSystem.repository.UserRepository;

@Service("adminService")
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository adminRepo;

	
	@Override
	public AdminEntity addAdminEntity(AdminEntity adminEntity) {
		return this.adminRepo.save(adminEntity);
	}

	@Override
	public AdminEntity findByAdminId(String email) {
		// TODO Auto-generated method stub
		return null;
	}
	
}