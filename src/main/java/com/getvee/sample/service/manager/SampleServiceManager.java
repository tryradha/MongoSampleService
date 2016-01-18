package com.getvee.sample.service.manager;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.getvee.sample.mongo.bean.User;
import com.getvee.sample.mongo.repository.UserRepository;
import com.getvee.sample.service.dtos.UserDTO;
import com.getvee.sample.service.exception.InvalidArgumentException;

@Component
public class SampleServiceManager {

	@Autowired
	private UserRepository userRepository;

	public String echo() {
		return "Alive";
	}

	public UserDTO getUserData(String userId) throws InvalidArgumentException {
		User user = userRepository.findOne(userId);
		if (user == null) {
			throw new InvalidArgumentException(" User Not Found");
		}
		UserDTO userDTO = new UserDTO();
		userDTO.setUserId(user.getId());
		userDTO.setUserName(user.getName());
		return userDTO;
	}

	public List<UserDTO> getUserDataByName(String userName) throws InvalidArgumentException {
		List<User> users = userRepository.getUserByNameLike(userName);
		List<UserDTO> userDTOs = new ArrayList<UserDTO>(users.size());
		if (users != null && !users.isEmpty()) {
			for (User user : users) {
				UserDTO userDTO = new UserDTO();
				userDTO.setUserId(user.getId());
				userDTO.setUserName(user.getName());
				userDTOs.add(userDTO);
			}
		}
		return userDTOs;
	}

	public UserDTO saveUserData(UserDTO userDTO) {
		User user = new User();
		user.setName(userDTO.getUserName());
		userRepository.save(user);
		userDTO.setUserId(user.getId());
		return userDTO;
	}

}
