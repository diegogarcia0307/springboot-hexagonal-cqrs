package com.hotel.hotel.command.domain.service;

import com.hotel.hotel.command.domain.repository.RentalRepository;

public class DeleteRentalService {

	private RentalRepository rentalRepository;

	public DeleteRentalService(RentalRepository rentalRepository) {
		super();
		this.rentalRepository = rentalRepository;
	}

	public boolean exect(Long id) {
		return rentalRepository.deleteRental(id);
	}

}
