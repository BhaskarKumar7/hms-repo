package com.boot.hms.dto;

import java.io.Serializable;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
@Data
public class AddressDto implements Serializable{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = -7763393855939964562L;
	private Integer addressId;
	@NotNull(message = "Address line should not be null")
	@NotBlank(message = "Please enter your addressline")
	@Size(min = 10,max = 200,message = "your address line should have min 10 characters and max 200 characters")
	private String addressLine;
	private String addressType;
	@NotNull(message = "Door number should not be null")
	@NotBlank(message = "Please enter your doorno")
	private String doorNo;
	@NotNull(message = "Landmark should not be null")
	@NotBlank(message = "Please enter your landmark")
	@Size(min = 10,max = 150,message = "your landmark should have min 10 characters and max 150 characters")
	private String landmark;
	@NotNull(message = "Pincode should not be null")
	@NotBlank(message = "Please enter your pincode")
	@Size(max = 6,min = 6,message = "Your pincode should be 6 characters")
	private String pincode;
	@NotNull(message = "Please select your city")
	private Integer cityId;
	@NotNull(message = "Please select your state")
	private Integer stateId;
	@NotNull(message = "Please select your country")
	private Integer countryId;
}
