package com.getvee.sample.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.getvee.sample.service.SampleService;
import com.getvee.sample.service.dtos.UserDTO;
import com.getvee.sample.service.exception.InvalidArgumentException;
import com.getvee.sample.service.manager.SampleServiceManager;

public class SampleServiceImpl implements SampleService {

	@Autowired
	private SampleServiceManager sampleServiceManager;

	public String echo() throws InvalidArgumentException {
		return sampleServiceManager.echo();
	}

	public UserDTO getUserData(String userId) throws InvalidArgumentException {
		return sampleServiceManager.getUserData(userId);
	}

	public UserDTO saveUserData(UserDTO userDTO) throws InvalidArgumentException {
		return sampleServiceManager.saveUserData(userDTO);
	}

	public List<UserDTO> getUserDataByName(String userName) throws InvalidArgumentException {
		return sampleServiceManager.getUserDataByName(userName);
	}

}
