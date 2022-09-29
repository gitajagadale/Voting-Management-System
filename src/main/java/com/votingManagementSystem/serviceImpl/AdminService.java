package com.votingManagementSystem.serviceImpl;

import java.util.List;

import com.votingManagementSystem.entity.AdminEntity;
import com.votingManagementSystem.exception.AdminNotFoundException;

public interface AdminService {

	AdminEntity addAdminEntity(AdminEntity adminEntity);

	AdminEntity findByAdminId(String email);

}
