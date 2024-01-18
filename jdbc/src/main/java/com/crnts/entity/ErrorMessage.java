package com.crnts.entity;

public class ErrorMessage {

	private String errorMessage;
	private String location;
	private int status_code;
	
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getStatus_code() {
		return status_code;
	}
	public void setStatus_code(int status_code) {
		this.status_code = status_code;
	}
	
	@Override
	public String toString() {
		return "ErrorMessage [errorMessage=" + errorMessage + ", location=" + location + ", status_code=" + status_code
				+ "]";
	}
	
	
}
