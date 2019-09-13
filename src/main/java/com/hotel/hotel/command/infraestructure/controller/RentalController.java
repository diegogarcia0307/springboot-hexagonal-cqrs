package com.hotel.hotel.command.infraestructure.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@RestController
@Api(tags = { "Controlador alquiler" })
@RequestMapping("/apiv1/hotel/alquiler")
public class RentalController {

}
