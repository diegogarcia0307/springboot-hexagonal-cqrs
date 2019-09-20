package com.hotel.hotel.command.aplication.handler;

import org.springframework.stereotype.Component;

import com.hotel.hotel.command.aplication.command.response.UpdateRentalResponse;
import com.hotel.hotel.command.domain.service.UpdateRentalService;

@Component
public class UpdateRentalHandler {

	private UpdateRentalService updateRentalService;

	public UpdateRentalHandler(UpdateRentalService updateRentalService) {
		this.updateRentalService = updateRentalService;
	}

	public UpdateRentalResponse exect(long idRental) {
		return new UpdateRentalResponse(updateRentalService.exect(idRental));
	}

}
