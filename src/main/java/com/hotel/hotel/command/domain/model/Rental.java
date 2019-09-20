package com.hotel.hotel.command.domain.model;

import java.util.Calendar;

import com.hotel.hotel.command.domain.model.validator.RentalValidator;

public class Rental {

	private Room room;
	private Guest guest;
	private Calendar checkIn;
	private Calendar checkOut;

	public Rental() {
		room = new Room();
		guest = new Guest();
		checkIn = Calendar.getInstance();
		checkOut = Calendar.getInstance();
	}

	public Rental(Room room, Guest guest) {
		RentalValidator.verifyGuest(guest);
		RentalValidator.verifyRoom(room);
		this.room = room;
		this.guest = guest;
		this.checkIn = Calendar.getInstance();
		this.checkOut = Calendar.getInstance();
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		RentalValidator.verifyRoom(room);
		this.room = room;
	}

	public Guest getGuest() {
		return guest;
	}

	public void setGuest(Guest guest) {
		RentalValidator.verifyGuest(guest);
		this.guest = guest;
	}

	public Calendar getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(Calendar checkIn) {
		this.checkIn = checkIn;
	}

	public Calendar getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(Calendar checkOut) {
		this.checkOut = checkOut;
	}

}
