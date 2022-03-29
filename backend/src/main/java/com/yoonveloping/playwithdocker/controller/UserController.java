package com.yoonveloping.playwithdocker.controller;

import com.yoonveloping.playwithdocker.model.User;
import com.yoonveloping.playwithdocker.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {

	private UserRepository userRepository;

	@GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<User>> getAllUsers() {
		List<User> users = userRepository.findAll();
		return new ResponseEntity<>(users, HttpStatus.OK);
	}

	@PostMapping("/user")
	public User createUser(@RequestBody User user) {
		return userRepository.save(user);
	}

	@GetMapping("/user/{id}")
	public Optional<User> readUser(@PathVariable Long id) {
		return userRepository.findById(id);
	}
}
