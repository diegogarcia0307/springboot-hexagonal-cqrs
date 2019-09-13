package com.hotel.hotel.command.aplication.factory;

import org.springframework.stereotype.Component;

import com.hotel.hotel.command.aplication.command.RentalCommand;
import com.hotel.hotel.command.domain.model.Rental;

@Component
public class RentalFactory {

	public Rental create(RentalCommand rentalCommand) {
		return new Rental(rentalCommand.getRoom(), rentalCommand.getGuest(), rentalCommand.getCheckIn(),
				rentalCommand.getCheckOut());
	}
}
