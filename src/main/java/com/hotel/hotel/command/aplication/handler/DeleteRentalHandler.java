package com.hotel.hotel.command.aplication.handler;

import org.springframework.stereotype.Component;

import com.hotel.hotel.command.aplication.command.response.DeleteRentalCommandResponse;
import com.hotel.hotel.command.domain.service.DeleteRentalService;

@Component
public class DeleteRentalHandler {

	private DeleteRentalService deleteRentalService;

	public DeleteRentalHandler(DeleteRentalService deleteRentalService) {
		this.deleteRentalService = deleteRentalService;
	}

	public DeleteRentalCommandResponse exec(Long id) {
		return new DeleteRentalCommandResponse(deleteRentalService.exect(id));
	}
}
