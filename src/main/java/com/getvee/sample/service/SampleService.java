package com.getvee.sample.service;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.getvee.sample.service.dtos.UserDTO;
import com.getvee.sample.service.exception.InvalidArgumentException;

@WebService
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON })
public interface SampleService {

	@GET
	@Path("/echo")
	@Consumes({ MediaType.MEDIA_TYPE_WILDCARD })
	@Produces({ MediaType.APPLICATION_JSON })
	String echo() throws InvalidArgumentException;

	@GET
	@Path("/getUserData/{userId}")
	@Consumes({ MediaType.MEDIA_TYPE_WILDCARD })
	@Produces({ MediaType.APPLICATION_JSON })
	UserDTO getUserData(@PathParam("userId") String userId) throws InvalidArgumentException;

	@GET
	@Path("/getUserDataByName/{userName}")
	@Consumes({ MediaType.MEDIA_TYPE_WILDCARD })
	@Produces({ MediaType.APPLICATION_JSON })
	List<UserDTO> getUserDataByName(@PathParam("userName") String userName) throws InvalidArgumentException;

	@POST
	@Path("/saveUserData")
	@Consumes({ MediaType.MEDIA_TYPE_WILDCARD })
	@Produces({ MediaType.APPLICATION_JSON })
	UserDTO saveUserData(UserDTO userDTO) throws InvalidArgumentException;

}
