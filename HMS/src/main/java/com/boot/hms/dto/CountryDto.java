package com.boot.hms.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class CountryDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4710515272472928385L;

	private Integer countryId;
	private String countryName;
	private String countryCapital;
}
