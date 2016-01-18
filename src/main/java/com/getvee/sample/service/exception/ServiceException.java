package com.getvee.sample.service.exception;


public class ServiceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String developerMessage;

	public ServiceException() {
	}

	public ServiceException(String str) {
		super(str);
	}

	public ServiceException(Throwable cause) {
		super(cause);
	}

	public ServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public ServiceException(String message, String developerMessage) {
		super(message);
		this.developerMessage = developerMessage;
	}

	public String getDeveloperMessage() {
		return developerMessage;
	}

	public void setDeveloperMessage(String developerMessage) {
		this.developerMessage = developerMessage;
	}

}