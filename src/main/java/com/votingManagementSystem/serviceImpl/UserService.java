package com.votingManagementSystem.serviceImpl;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.votingManagementSystem.entity.UserDTO;
import com.votingManagementSystem.entity.UserEntity;
import com.votingManagementSystem.exception.UserNotFoundException;

public interface UserService {

	UserEntity addUserEntity(UserEntity userEntity);

	List<UserEntity> showUserEntitys();

	UserEntity updateUserEntity(UserDTO userDTO) throws UserNotFoundException;

	UserEntity getUserEntityById(@Valid Integer userEntityId) throws UserNotFoundException;

	UserEntity deleteUserEntityById(Integer id) throws UserNotFoundException;
    
	
}
