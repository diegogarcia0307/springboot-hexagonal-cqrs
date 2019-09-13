/**
 * This class actually is not used
 */

package com.hotel.hotel.command.aplication.factory;

import org.springframework.stereotype.Component;

import com.hotel.hotel.command.aplication.command.RoomCommand;
import com.hotel.hotel.command.domain.model.Room;

@Component
public class RoomFactory {

	public Room create(RoomCommand roomCommand) {
		return new Room(roomCommand.getRoomName(), roomCommand.getType(), roomCommand.getCapacity(),
				roomCommand.getNumBeds());
	}
}
