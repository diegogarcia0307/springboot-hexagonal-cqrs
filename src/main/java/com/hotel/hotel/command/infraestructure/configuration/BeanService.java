package com.hotel.hotel.command.infraestructure.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hotel.hotel.command.domain.service.CreateRentalService;
import com.hotel.hotel.command.domain.service.DeleteRentalService;
import com.hotel.hotel.command.domain.service.UpdateRentalService;
import com.hotel.hotel.command.infraestructure.repository.RentalRepositoryMySQL;

@Configuration
public class BeanService {

	@Bean
	public CreateRentalService createRentalService() {
		return new CreateRentalService(new RentalRepositoryMySQL());
	}

	@Bean
	public UpdateRentalService updateRentalService() {
		return new UpdateRentalService(new RentalRepositoryMySQL());
	}

	@Bean
	public DeleteRentalService deleteRentalService() {
		return new DeleteRentalService(new RentalRepositoryMySQL());
	}
}
