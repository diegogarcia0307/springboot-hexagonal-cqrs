/**
 * This class actually is not used
 */

package com.hotel.hotel.command.aplication.factory;

import org.springframework.stereotype.Component;

import com.hotel.hotel.command.aplication.command.GuestCommand;
import com.hotel.hotel.command.domain.model.Guest;

@Component
public class GuestFactory {

	public Guest create(GuestCommand guestCommand) {
		return new Guest(guestCommand.getId(), guestCommand.getNumberID(), guestCommand.getName());
	}
}
