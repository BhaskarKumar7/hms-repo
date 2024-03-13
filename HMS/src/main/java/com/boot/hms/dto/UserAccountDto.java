package com.boot.hms.dto;

import java.io.Serializable;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserAccountDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5308477845537296134L;

	private Integer userId;
	@NotNull(message = "User name should not be null")
	@NotBlank(message = "Please enter your username")
	@Size(min = 2,max = 20,message = "Your username must have min 2 characters and max 20 characters")
	private String userName;
	@NotNull(message = "Password Should not be null")
	@NotBlank(message = "Please enter your password")
	@Min(value = 5,message = "Your password must be of atleast 5 characters long")
	private String userPassword;
	@NotNull(message = "Confirm password Should not be null")
	@NotBlank(message = "Please enter your confirm password")
	private String userConfirmPassword;
	@NotNull(message = "Email Should not be null")
	@NotBlank(message = "Please enter your email")
	@Email(message = "Please enter valid email")
	private String userEmail;
	@NotBlank(message = "Please select year")
	private String userYear;
	@NotBlank(message = "Please select month")
	private String userMonth;
	@NotBlank(message = "Please select day")
	private String userDay;
	@NotNull(message = "Mobile number should not be null")
	@NotBlank(message = "Please enter your mobile number")
	@Size(min = 10,max = 10,message = "Mobile number length must be 10 digits")
	private String userMobileNo;
	@NotBlank(message = "Please select  your gender")
	private String userGender;
	@Valid
	private AddressDto userAddress;
	private String userRole;
	private UserDepartmentDto userDepartment;
}
