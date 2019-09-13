package com.hotel.hotel.command.domain.exceptions;

public class RentalException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RentalException(String errorMessage) {
		super(errorMessage);
	}
}
