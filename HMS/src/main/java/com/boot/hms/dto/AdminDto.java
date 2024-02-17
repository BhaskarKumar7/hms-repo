package com.boot.hms.dto;

import java.io.Serializable;

import com.boot.hms.enums.UserRoleEnum;

import lombok.Data;

@Data
public class AdminDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2275937374184491545L;
	
	private UserAccountDto adminDetails;
	private AddressDto adminAddrs;
	private String role = UserRoleEnum.ROLE_ADMIN.name();
	private String department = "ADMIN_DEPT";

}
