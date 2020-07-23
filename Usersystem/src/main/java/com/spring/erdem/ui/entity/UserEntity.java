package com.spring.erdem.ui.entity;

import java.io.Serializable;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;


@Entity(name="users")
public class UserEntity implements Serializable {

	private static final long serialVersionUID = -2928096491937953968L;
	
	@Getter
	@Setter
	@Id
	@GeneratedValue
	private long id;
	
	@Column(nullable=false)
	@Getter
	@Setter
	private String userId;
	
	@Column(nullable=false, length=50)
	@Getter
	@Setter
	private String firstName;
	
	@Column(nullable=false, length=50)
	@Getter
	@Setter
	private String lastName;
	
	@Column( nullable=false, length=200)
	@Getter
	@Setter
	private String email;
	
	@Column(nullable=false)
	@Getter
	@Setter
	private String encryptetPassword;
	
	@Getter
	@Setter
	private String emailVerificationToken;
	
	@Column(nullable=false)
	@Getter
	@Setter
	private Boolean emailVerificationStatus=false;
	
}
