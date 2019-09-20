package com.hotel.hotel.command.infraestructure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.hotel.command.aplication.command.RentalCommand;
import com.hotel.hotel.command.aplication.command.response.CreateRentalResponse;
import com.hotel.hotel.command.aplication.command.response.DeleteRentalResponse;
import com.hotel.hotel.command.aplication.command.response.UpdateRentalResponse;
import com.hotel.hotel.command.aplication.handler.CreateRentalHandler;
import com.hotel.hotel.command.aplication.handler.DeleteRentalHandler;
import com.hotel.hotel.command.aplication.handler.UpdateRentalHandler;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(tags = { "Controlador alquiler" })
@RequestMapping("/apiv1/hotel/alquiler")
public class RentalController {

	private final CreateRentalHandler createRentalHandler;
	private final DeleteRentalHandler deleteRentalHandler;
	private final UpdateRentalHandler updateRentalHandler;

	@Autowired
	public RentalController(CreateRentalHandler createRentalHandler, DeleteRentalHandler deleteRentalHandler,
			UpdateRentalHandler updateRentalHandler) {
		this.createRentalHandler = createRentalHandler;
		this.deleteRentalHandler = deleteRentalHandler;
		this.updateRentalHandler = updateRentalHandler;
	}

	@ApiOperation("Create rental o checkin")
	@PostMapping
	public CreateRentalResponse createRental(@RequestBody RentalCommand rentalCommand) {
		return createRentalHandler.exect(rentalCommand);
	}

	@ApiOperation("Delete rental")
	@DeleteMapping(value = "/{id}")
	public DeleteRentalResponse deleteRental(@PathVariable Long idRental) {
		return deleteRentalHandler.exec(idRental);
	}

	@ApiOperation("Update rental o checkout")
	@PutMapping(value = "/{idRental}")
	public UpdateRentalResponse updateRental(@PathVariable long idRental) {
		return updateRentalHandler.exect(idRental);
	}
}
