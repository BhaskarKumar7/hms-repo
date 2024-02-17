package com.boot.hms.util;

import at.favre.lib.crypto.bcrypt.BCrypt;

public class BcryptUtility {
	
	private BcryptUtility()	{
		
	}
	
	public static String generateHash(String actualPassword) {
		return BCrypt
				.withDefaults()
				.hashToString(12, actualPassword.toCharArray());
	}
	
}
