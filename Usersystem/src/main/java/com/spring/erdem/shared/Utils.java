package com.spring.erdem.shared;

import java.security.SecureRandom;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Utils {
	private final Random RANDOM= new SecureRandom();
	private final String ABC="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	
	public String generateUserId(int length) {
		StringBuilder returnValue=new StringBuilder(length);
		for (int i = 0; i < length; i++) {
			returnValue.append(ABC.charAt(RANDOM.nextInt(ABC.length())));
		}
		return new String(returnValue);
	}
}
