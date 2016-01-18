package com.getvee.sample.service.exception.handler;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.getvee.sample.service.dtos.ErrorMessage;
import com.getvee.sample.service.exception.InvalidArgumentException;

@Provider
public class ExceptionHandler implements ExceptionMapper<Throwable> {

	public Response toResponse(Throwable exception) {
		exception.printStackTrace();
		ErrorMessage errorMessage = new ErrorMessage();
		errorMessage.setMessage(exception.getMessage());
		errorMessage.setType(exception.getClass());

		Status status = null;
		if (exception instanceof InvalidArgumentException) {
			status = Status.BAD_REQUEST;
		} else {
			status = Status.INTERNAL_SERVER_ERROR;
		}
		return Response.status(status).entity(errorMessage).build();
	}

}