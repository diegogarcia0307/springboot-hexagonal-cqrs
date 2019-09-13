package com.hotel.hotel.command.domain.model;

import com.hotel.hotel.command.domain.model.validator.GuestValidator;

public class Guest {

	private Long id;
	private Long numberID;
	private String name;

	public Guest() {
		id = 0L;
		numberID = 0L;
		name = "";
	}

	public Guest(Long id, Long numberID, String name) {
		GuestValidator.verifyNumberID(numberID);
		GuestValidator.verifyName(name);
		this.id = id;
		this.numberID = numberID;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNumberID() {
		return numberID;
	}

	public void setNumberID(Long numberID) {
		this.numberID = numberID;
	}

	public void setName(String name) {
		GuestValidator.verifyName(name);
		this.name = name;
	}

}
