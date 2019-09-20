package com.hotel.hotel.command.domain.service;

import com.hotel.hotel.command.domain.repository.RentalRepository;

public class UpdateRentalService {

	private RentalRepository rentalRepository;

	public UpdateRentalService(RentalRepository rentalRepository) {
		super();
		this.rentalRepository = rentalRepository;
	}

	public boolean exect(long idRental) {
		return rentalRepository.updateRental(idRental);
	}

}
