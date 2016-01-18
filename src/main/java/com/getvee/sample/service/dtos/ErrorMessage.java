package com.getvee.sample.service.dtos;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class ErrorMessage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Class<? extends Throwable> type;
	private String message;
	private String developerMessage;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDeveloperMessage() {
		return developerMessage;
	}

	public void setDeveloperMessage(String developerMessage) {
		this.developerMessage = developerMessage;
	}

	public Class<? extends Throwable> getType() {
		return type;
	}

	public void setType(Class<? extends Throwable> type) {
		this.type = type;
	}

}
