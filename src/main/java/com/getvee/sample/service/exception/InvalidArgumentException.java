package com.getvee.sample.service.exception;


public class InvalidArgumentException extends ServiceException {

	private static final long serialVersionUID = 1L;

	public InvalidArgumentException(String message, String developerMessage) {
		super(message, developerMessage);
	}

	public InvalidArgumentException() {
	}

	public InvalidArgumentException(String str) {
		super(str);
	}

	public InvalidArgumentException(Throwable cause) {
		super(cause);
	}

	public InvalidArgumentException(String message, Throwable cause) {
		super(message, cause);
	}

}
