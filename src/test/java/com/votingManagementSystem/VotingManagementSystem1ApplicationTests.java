package com.votingManagementSystem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.votingManagementSystem.entity.UserDTO;
import com.votingManagementSystem.entity.UserEntity;
import com.votingManagementSystem.exception.UserNotFoundException;
import com.votingManagementSystem.serviceImpl.UserService;


@SpringBootTest
class VotingManagementSystem1ApplicationTests {
	
	@Autowired
	private UserService userService;

	@Test
	void addUserTest() {
		UserEntity user = new UserEntity(105, "sonali", "rh-23", null, "female", "83754974", null);
		UserEntity testUser = this.userService.addUserEntity(user);
		assertNotNull(testUser);// it should return newly added user object
		// remove test data
	}

	@Test
	void updateUserTest() {
		UserDTO userDTO = new UserDTO(105, "rahul", "rh-44", null, "male", null, "nagar");

		assertThrows(UserNotFoundException.class, () -> this.userService.updateUserEntity(userDTO));

	}

	@Test
	void updateUserTest2() {
		

		UserDTO userDTO = new UserDTO(15, "TestName", null, null, null,"689780769", "aurangabad");

		try {
			UserEntity updatedUser = this.userService.updateUserEntity(userDTO);

			assertEquals("TestName", updatedUser.getName());
		} catch (UserNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
