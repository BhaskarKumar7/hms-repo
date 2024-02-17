package com.boot.hms.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserAccountDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5308477845537296134L;

	private Integer userId;
	private String userName;
	private String userPassword;
	private String userConfirmPassword;
	private String userEmail;
	private String userYear;
	private String userMonth;
	private String userDay;
	private String userMobileNo;
	private String userGender;
	private AddressDto userAddress;
	private String userRole;
	private UserDepartmentDto userDepartment;
}
