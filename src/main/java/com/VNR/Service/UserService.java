package com.VNR.Service;

import com.VNR.model.User;
import com.VNR.dto.UserDto;


public interface UserService {

	User findByUsername(String username);
	User save(UserDto userDto);
}
