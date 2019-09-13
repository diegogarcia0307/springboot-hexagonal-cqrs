package com.hotel.hotel.command.domain.repository;

import com.hotel.hotel.command.domain.model.Rental;

public interface RentalRepository {

	/**
	 * Let add or register a rental
	 * *@param a rental
	 * @return rental ID generated 
	 */
	public Long createRental(Rental rental);
	
	/**
	 * Use to update a rental
	 * @param rental
	 * @return rental modified
	 */
	public Rental updateRental(Rental rental);
	
	/***
	 * Let delete a rental
	 * @param rental id
	 * @return true if the operation is success, or false if the operation is wrong 
	 */
	public boolean deleteRental(Long id);

	/**
	 * Let list a rental
	 * @return a rental
	 */
	public Rental listRental();
	
}
