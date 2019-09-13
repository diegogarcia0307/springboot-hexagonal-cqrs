package com.hotel.hotel.command.domain.service;

import com.hotel.hotel.command.domain.model.Rental;
import com.hotel.hotel.command.domain.repository.RentalRepository;

public class UpdateRentalService {

	private RentalRepository rentalRepository;

	public UpdateRentalService(RentalRepository rentalRepository) {
		super();
		this.rentalRepository = rentalRepository;
	}

	public Rental exect(Rental rental) {
		return rentalRepository.updateRental(rental);
	}

}
