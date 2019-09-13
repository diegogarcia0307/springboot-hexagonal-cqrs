package com.hotel.hotel.command.domain.model.validator;

import java.util.Date;

import com.hotel.hotel.command.domain.exceptions.RentalException;
import com.hotel.hotel.command.domain.model.Guest;
import com.hotel.hotel.command.domain.model.Room;

public class RentalValidator {

	private static final String CHECKIN_DATE_NECESSARY = "La fecha de entrada es necesaria.";
	private static final String ROOM_NECESSARY = "Es obligatorio relacionar la habitación correspondiente.";
	private static final String GUEST_NECESSARY = "Es obligatorio relacionar el huesped correspondiente.";

	public static void verifyDateCheckIn(Date date) {
		if (date == null)
			throw new RentalException(CHECKIN_DATE_NECESSARY);
	}

	public static void verifyRoom(Room room) {
		if (room == null)
			throw new RentalException(ROOM_NECESSARY);
	}

	public static void verifyGuest(Guest guest) {
		if (guest == null)
			throw new RentalException(GUEST_NECESSARY);
	}
}
