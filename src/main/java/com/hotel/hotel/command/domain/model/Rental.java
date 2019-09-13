package com.hotel.hotel.command.domain.model;

import java.util.Date;

import com.hotel.hotel.command.domain.model.validator.RentalValidator;

public class Rental {

	private Room room;
	private Guest guest;
	private Date checkIn;
	private Date checkOut;

	public Rental() {
		room = new Room();
		guest = new Guest();
		checkIn = new Date();
		checkOut = new Date();
	}

	public Rental(Room room, Guest guest, Date checkIn, Date checkOut) {
		RentalValidator.verifyDateCheckIn(checkIn);
		RentalValidator.verifyGuest(guest);
		RentalValidator.verifyRoom(room);
		this.room = room;
		this.guest = guest;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
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

	public Date getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(Date checkIn) {
		RentalValidator.verifyDateCheckIn(checkIn);
		this.checkIn = checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}

}
