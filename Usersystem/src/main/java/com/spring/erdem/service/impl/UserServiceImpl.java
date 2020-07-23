package com.spring.erdem.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.erdem.UserRepo;
import com.spring.erdem.service.UserService;
import com.spring.erdem.shared.Utils;
import com.spring.erdem.shared.dto.UserDto;
import com.spring.erdem.ui.entity.UserEntity;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	Utils utils;

	@Override
	public UserDto createUser(UserDto user) {
		
		if(userRepo.findByEmail(user.getEmail())!=null)
			throw new RuntimeException("gggg");
		
		UserEntity userEntity =new UserEntity();
		BeanUtils.copyProperties(user, userEntity);
		userEntity.setEncryptetPassword("testpass");
		userEntity.setUserId(utils.generateUserId(30));
		
		UserEntity storedUserDetails=userRepo.save(userEntity);
		
		UserDto returnedValue= new UserDto();
		BeanUtils.copyProperties(storedUserDetails, returnedValue);
		
		return returnedValue;
	}

}
