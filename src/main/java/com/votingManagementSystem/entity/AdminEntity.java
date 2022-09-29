package com.votingManagementSystem.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
@Entity
public class AdminEntity {
	@Id
	//@Email(message="enter correct email  example@gmail.com")
	private String email;
	
	//@NotNull(message="password is mandatory")
	private String password;


	public AdminEntity() {
		super();
	}

	

	public AdminEntity(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	


}
