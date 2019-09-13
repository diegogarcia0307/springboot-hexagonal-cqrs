package com.hotel.hotel.command.domain.model;

import com.hotel.hotel.command.domain.model.validator.RoomValidator;

public class Room {

	private String roomName;
	/* Sencilla 0, Doble 1, Grupal 2 */
	private int type;
	private int capacity;
	private int numBeds;

	public Room() {
		roomName = "101";
		type = 0;
		capacity = 1;
		numBeds = 1;
	}

	public Room(String roomName, int type, int capacity, int numBeds) {
		RoomValidator.verifyRoomName(roomName);
		RoomValidator.verifyType(type);
		RoomValidator.verifyCapacity(capacity);
		RoomValidator.verifyNumBeds(numBeds);
		this.roomName = roomName;
		this.type = type;
		this.capacity = capacity;
		this.numBeds = numBeds;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		RoomValidator.verifyRoomName(roomName);
		this.roomName = roomName;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		RoomValidator.verifyType(type);
		this.type = type;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		RoomValidator.verifyCapacity(capacity);
		this.capacity = capacity;
	}

	public int getNumBeds() {
		return numBeds;
	}

	public void setNumBeds(int numBeds) {
		RoomValidator.verifyNumBeds(numBeds);
		this.numBeds = numBeds;
	}

}
