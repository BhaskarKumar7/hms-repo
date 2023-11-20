package com.boot.hms.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class ServerResponseDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1059985395613766017L;

	private String responseMessage;
	private String responseStatus;
	private Integer responseCode;
}
