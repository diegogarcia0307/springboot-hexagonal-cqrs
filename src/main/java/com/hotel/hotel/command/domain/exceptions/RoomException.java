package com.hotel.hotel.command.domain.exceptions;

public class RoomException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RoomException(String errorMessage) {
		super(errorMessage);
	}

}
