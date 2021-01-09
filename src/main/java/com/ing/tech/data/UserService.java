package com.ing.tech.data;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import utils.BcryptHasing;

@Service
public class UserService {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	UserRepository userRepository;
	@Autowired
	BcryptHasing hash;

	public Optional<User> findByUsername(String userName) {
		Optional<User> userOptional = userRepository.findByUsername(userName).stream()
				.filter(user -> userName.equals(user.getUsername())).findFirst();
		if (userOptional.isEmpty()) {
			throw new RuntimeException("User does not exist");
		}
		return userOptional;
	}

	public User saveUser(User user) {
		List<User> users = userRepository.findByUsername(user.getUsername());
		if (users.size() > 0)
			throw new RuntimeException("User already exists");
		user.setPass(hash.getEncodedPass(user.getPass()));
		return userRepository.save(user);
	}

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public boolean passwordMatching(String originalPassword, String encodedPassword) {
		return hash.passwordMatching(originalPassword, encodedPassword);
	}
}
