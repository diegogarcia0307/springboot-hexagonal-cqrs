package com.hotel.hotel.command.domain.model.validator;

import com.hotel.hotel.command.domain.exceptions.GuestException;

public class GuestValidator {

	private static final String NAME_OBLIGATORY = "El nombre del hu�sped es obligatorio.";
	private static final String NUMBER_IDENTIFICATION_OBLIGATORY = "La c�dula debe ser digitada obligatoriamente y con un n�mero v�lido.";
	private static final String OBJECT_NULL = "El objeto debe contener todos los datos pedidos.";
	private static final String ID_RIGTH = "El id del huesped debe ser positivo.";

	public static void notNullGuest(Object object) {
		if (object == null)
			throw new GuestException(OBJECT_NULL);
	}

	public static void verifyName(String name) {
		if (name.isEmpty())
			throw new GuestException(NAME_OBLIGATORY);
	}

	public static void verifyNumberID(Long numberID) {
		if (numberID <= 0)
			throw new GuestException(NUMBER_IDENTIFICATION_OBLIGATORY);
	}

	public static void verifyID(Long id) {
		if (id <= 0)
			throw new GuestException(ID_RIGTH);
	}
}
