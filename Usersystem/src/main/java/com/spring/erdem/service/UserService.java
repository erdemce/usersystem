package com.spring.erdem.service;

import org.springframework.stereotype.Component;

import com.spring.erdem.shared.dto.UserDto;


public interface UserService {
	public UserDto createUser (UserDto user);

}
