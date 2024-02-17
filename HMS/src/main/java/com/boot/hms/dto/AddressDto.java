package com.boot.hms.dto;

import java.io.Serializable;

import lombok.Data;
@Data
public class AddressDto implements Serializable{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = -7763393855939964562L;
	private Integer addressId;
	private String addressLine;
	private String addressType;
	private String doorNo;
	private String landmark;
	private String pincode;
	private Integer cityId;
	private Integer stateId;
	private Integer countryId;
}
