package com.hotel.hotel.command.domain.model.validator;

import com.hotel.hotel.command.domain.exceptions.RoomException;

public class RoomValidator {

	private static final String ROOM_NAME_OBLIGATORY = "El nombre de la habitaci�n es obligatorio.";
	private static final String TYPE_OBLIGATORY = "Debe definir el tipo de la habitaci�n: Sencilla, Doble, Grupal.";
	private static final String CAPACITY_OBLIGATORY = "Debe indicar la capacidad de la habitaci�n.";
	private static final String NUM_BEDS_OBLIGATORY = "Es obligatorio ingresar el n�mero de camas de la habitaci�n";

	public static void verifyRoomName(String name) {
		if (name.isEmpty())
			throw new RoomException(ROOM_NAME_OBLIGATORY);
	}

	public static void verifyType(int type) {
		if (type < 0 || type > 2)
			throw new RoomException(TYPE_OBLIGATORY);
	}

	public static void verifyCapacity(int capacity) {
		if (capacity <= 0)
			throw new RoomException(CAPACITY_OBLIGATORY);
	}

	public static void verifyNumBeds(int number) {
		if (number <= 0)
			throw new RoomException(NUM_BEDS_OBLIGATORY);
	}
}
