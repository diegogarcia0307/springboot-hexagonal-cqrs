package com.hotel.hotel.command.domain.exceptions;

public class GuestException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public GuestException(String errorMessage) {
		super(errorMessage);
	}

}
