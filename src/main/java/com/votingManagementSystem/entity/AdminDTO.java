package com.votingManagementSystem.entity;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AdminDTO {
	@Id
	@NotNull(message = "Email cannot be null")
	@Size(min = 8, message = "Email should be of min 8 chars")
	private String email;
	
	@NotNull(message="password is mandatory")
	private String password;

	
	public AdminDTO(
			@NotNull(message = "Email cannot be null") @Size(min = 8, message = "Email should be of min 8 chars") String email,
			@NotNull(message = "password is mandatory") String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public AdminDTO() {
		super();
	}

	@Override
	public String toString() {
		return "AdminEntity [email= abd@gmail.com, password= Pass#12]";
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

	
