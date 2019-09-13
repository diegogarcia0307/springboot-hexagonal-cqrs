package com.hotel.hotel.command.aplication.command;

import java.util.Date;

import com.hotel.hotel.command.domain.model.Guest;
import com.hotel.hotel.command.domain.model.Room;

public class RentalCommand {
	private Room room;
	private Guest guest;
	private Date checkIn;
	private Date checkOut;

	public RentalCommand(Room room, Guest guest, Date checkIn, Date checkOut) {
		super();
		this.room = room;
		this.guest = guest;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Guest getGuest() {
		return guest;
	}

	public void setGuest(Guest guest) {
		this.guest = guest;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}

}
