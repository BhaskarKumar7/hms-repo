package com.boot.hms.exception;

import java.util.List;

public class InvalidInputException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4401348705224491323L;
	List<String> errorMessages;
	public InvalidInputException(List<String> errorMessages) {
		this.errorMessages = errorMessages;
	}

}
