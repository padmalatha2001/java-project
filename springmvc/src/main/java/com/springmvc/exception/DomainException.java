package com.springmvc.exception;

public class DomainException extends Exception{

	private static final long serialVersionUID = -7635455029183385062L;

	public DomainException(String message) {
		super(message);
	}

	public DomainException(String message, Exception exception) {
		super(message, exception);
	}
}
