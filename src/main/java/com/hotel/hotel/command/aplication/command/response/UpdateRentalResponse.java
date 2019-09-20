package com.hotel.hotel.command.aplication.command.response;

public class UpdateRentalResponse {
	private boolean requestEstate;
	private String messageRequest;

	public UpdateRentalResponse(boolean requestEstate) {
		messageRequest = requestEstate ? "Registro actualizado con éxito." : "El registro no se pudo actualizar.";
		this.requestEstate = requestEstate;
	}

	public boolean isRequestEstate() {
		return requestEstate;
	}

	public void setRequestEstate(boolean requestEstate) {
		this.requestEstate = requestEstate;
	}

	public String getMessageRequest() {
		return messageRequest;
	}

	public void setMessageRequest(String messageRequest) {
		this.messageRequest = messageRequest;
	}
}
