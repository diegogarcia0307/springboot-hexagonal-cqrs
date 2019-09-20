package com.hotel.hotel.command.aplication.handler;

import org.springframework.stereotype.Component;

import com.hotel.hotel.command.aplication.command.RentalCommand;
import com.hotel.hotel.command.aplication.command.response.CreateRentalResponse;
import com.hotel.hotel.command.aplication.factory.RentalFactory;
import com.hotel.hotel.command.domain.model.Rental;
import com.hotel.hotel.command.domain.service.CreateRentalService;

@Component
public class CreateRentalHandler {

	private final CreateRentalService createRentalService;
	private final RentalFactory rentalFactory;

	public CreateRentalHandler(CreateRentalService createRentalService, RentalFactory rentalFactory) {
		this.createRentalService = createRentalService;
		this.rentalFactory = rentalFactory;
	}

	public CreateRentalResponse exect(RentalCommand rentalCommand) {
		Rental rental = rentalFactory.create(rentalCommand);
		return new CreateRentalResponse(createRentalService.exect(rental));
	}

}
