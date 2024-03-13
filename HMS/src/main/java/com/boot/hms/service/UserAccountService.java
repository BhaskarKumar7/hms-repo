package com.boot.hms.service;

import com.boot.hms.dto.ServerResponseDto;
import com.boot.hms.dto.UserAccountDto;

public interface UserAccountService {

	public ServerResponseDto createUserAccount(UserAccountDto userAccountDto);
	public boolean doesEmailExists(String email);
	public boolean doesMobileNumberExists(String mobileNo);
	public boolean doesUsernameExists(String username);
}
