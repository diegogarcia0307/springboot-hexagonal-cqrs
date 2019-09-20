package com.hotel.hotel.command.aplication.command;

import com.hotel.hotel.command.domain.model.Guest;
import com.hotel.hotel.command.domain.model.Room;

public class RentalCommand {
	private Room room;
	private Guest guest;

	public RentalCommand() {
		room = new Room();
		guest = new Guest();
	}

	public RentalCommand(Room room, Guest guest) {
		this.room = room;
		this.guest = guest;
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

	@Override
	public String toString() {
		return "RentalCommand [room=" + room + ", guest=" + guest + "]";
	}

}
