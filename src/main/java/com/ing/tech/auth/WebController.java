package com.ing.tech.auth;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ing.tech.data.User;
import com.ing.tech.data.UserService;

@RestController
public class WebController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private UserService userService;

	@PostMapping("/login")
	public ResponseEntity<User> login(@RequestBody User user) {
		Optional<User> userOptional = userService.findByUsername(user.getUsername());
		if (!userService.passwordMatching(user.getPass(), userOptional.get().getPass())) {
			return new ResponseEntity<User>(user, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

	@PostMapping("/createUser")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		User userOptional = userService.saveUser(user);
		return new ResponseEntity<User>(user, HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllUsers")
	public List<User> getAllUsers() {
		return userService.findAll();
	}

}
