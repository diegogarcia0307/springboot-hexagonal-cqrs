package com.hotel.hotel.command.aplication.handler;

import org.springframework.stereotype.Component;

import com.hotel.hotel.command.aplication.command.RentalCommand;
import com.hotel.hotel.command.aplication.factory.RentalFactory;
import com.hotel.hotel.command.domain.model.Rental;
import com.hotel.hotel.command.domain.service.UpdateRentalService;

@Component
public class UpdateRentalHandler {

	private UpdateRentalService updateRentalService;
	private RentalFactory rentalFactory;

	public UpdateRentalHandler(UpdateRentalService updateRentalService, RentalFactory rentalFactory) {
		this.updateRentalService = updateRentalService;
		this.rentalFactory = rentalFactory;
	}

	public RentalCommand exect(RentalCommand rentalCommand) {
		Rental rental = rentalFactory.create(rentalCommand);
		rental = updateRentalService.exect(rental);
		return new RentalCommand(rental.getRoom(), rental.getGuest(), rental.getCheckIn(), rental.getCheckOut());
	}

}
