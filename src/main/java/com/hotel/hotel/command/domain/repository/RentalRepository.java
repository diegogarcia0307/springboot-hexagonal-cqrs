package com.hotel.hotel.command.domain.repository;

import com.hotel.hotel.command.domain.model.Guest;
import com.hotel.hotel.command.domain.model.Rental;
import com.hotel.hotel.command.domain.model.Room;

public interface RentalRepository {

	/**
	 * Let add or register a rental *@param a rental
	 * 
	 * @return rental ID generated
	 */
	public Long createRental(Rental rental);

	/***
	 * Let create a Room
	 * 
	 * @param a room
	 * @return room id
	 */
	public Long createRoom(Room room);

	/***
	 * Let create a Guest
	 * 
	 * @param a guest
	 * @return guest id
	 */
	public Long createGuest(Guest guest);

	/**
	 * Use to update a rental
	 * 
	 * @param rental
	 * @return rental modified
	 */
	public boolean updateRental(long idRental);

	/***
	 * Let delete a rental
	 * 
	 * @param rental id
	 * @return true if the operation is success, or false if the operation is wrong
	 */
	public boolean deleteRental(Long id);

	/**
	 * Let list a rental
	 * 
	 * @return a rental
	 */
	public Rental listRental();

}
