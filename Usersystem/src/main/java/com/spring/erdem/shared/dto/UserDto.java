package com.spring.erdem.shared.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;




public class UserDto implements Serializable {

	private static final long serialVersionUID = 8119784395508598970L;
	
	@Getter
	@Setter
	private long id;
	
	@Getter
	@Setter
	private String userId;
	
	@Getter
	@Setter
	private String firstName;
	
	@Getter
	@Setter
	private String lastName;
	
	@Getter
	@Setter
	private String email;
	
	@Getter
	@Setter
	private String password;
	
	@Getter
	@Setter
	private String encryptedPassword;
	
	@Getter
	@Setter
	private String emailVerificationToken;
	
	@Getter
	@Setter
	private Boolean emailVerificationStatus=false;

}
