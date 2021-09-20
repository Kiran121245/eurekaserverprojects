package com.htc.userservice.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htc.userservice.entity.UserService;
import com.htc.userservice.service.UserServiceInterface;

@RestController
@RequestMapping("/api")
public class UserServiceControler {

	@Autowired
	UserServiceInterface userServiceInterface;

	@PostMapping("/adduser")
	public UserService createNewUser(@RequestBody UserService userService) {

		return userServiceInterface.save(userService);

	}

}