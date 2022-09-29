package com.votingManagementSystem.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.votingManagementSystem.entity.AdminDTO;
import com.votingManagementSystem.entity.AdminEntity;
import com.votingManagementSystem.repository.AdminRepository;
import com.votingManagementSystem.serviceImpl.AdminService;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {

	@Autowired
    private AdminService adminService;
    
    @PostMapping("admin")
    public AdminEntity addadminEntity(@Valid@RequestBody AdminDTO adminDTO){
       AdminEntity adminEntity = new AdminEntity(adminDTO.getEmail(), adminDTO.getPassword());
                return this.adminService.addAdminEntity(adminEntity);
 
                /*  @PostMapping("/admin")
	public ResponseEntity<?> loginAdmin(@RequestBody AdminEntity adminData) {
    	System.out.println(adminData);
    	AdminEntity adminEntity=adminService.findByAdminId(adminData.getEmail());
    	if(adminEntity.getPassword().equals(adminData.getPassword()))
    		return ResponseEntity.ok(adminEntity);
    	return (ResponseEntity<?>) ResponseEntity.internalServerError();
    }*/
    }
}
