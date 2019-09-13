package com.hotel.hotel.command.domain.service;

import com.hotel.hotel.command.domain.model.Rental;
import com.hotel.hotel.command.domain.repository.RentalRepository;

public class CreateRentalService {

	private final RentalRepository rentalRepository;

	public CreateRentalService(RentalRepository rentalRepository) {
		this.rentalRepository = rentalRepository;
	}

	public Long exect(Rental rental) {
		return rentalRepository.createRental(rental);
	}

}
