package com.hotel.hotel.command.aplication.command.response;

public class DeleteRentalResponse {

	private boolean requestEstate;
	private String messageRequest;

	public DeleteRentalResponse(boolean requestEstate) {
		messageRequest = requestEstate ? "Registro eliminado con éxito." : "El registro no se pudo eliminar.";
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
