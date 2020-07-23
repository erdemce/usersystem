package com.spring.erdem.ui.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.erdem.service.UserService;
import com.spring.erdem.shared.dto.UserDto;
import com.spring.erdem.ui.model.request.UserRequest;
import com.spring.erdem.ui.model.response.UserRest;

@RestController
@RequestMapping("users")
public class UserController {
	
	
	@Autowired
	UserService userService;
	
	@GetMapping
	public  String getUser() {
		return "get user was called!";
	}
	
	@PostMapping
	public  UserRest cerateUser(@RequestBody UserRequest userDetails) {
		UserRest  returnValue=new UserRest();
		
		UserDto userDto= new UserDto();
		BeanUtils.copyProperties(userDetails, userDto);
		
		UserDto createdUser=userService.createUser(userDto);
		BeanUtils.copyProperties(createdUser, returnValue);
		
		return returnValue;
	}
	
	@PutMapping
	public  String updateUser() {
		return "update user was called!";
	}
	
	@DeleteMapping
	public  String deleteUser() {
		return "delete user was called!";
	}

}
