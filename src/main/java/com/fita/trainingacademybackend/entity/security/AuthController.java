package com.fita.trainingacademybackend.entity.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fita.trainingacademybackend.entity.User;
import com.fita.trainingacademybackend.repository.UserRepository;

@RestController
@RequestMapping("/auth")
public class AuthController {
	
	private final UserRepository userRepo;
	private final BCryptPasswordEncoder encoder;

	public AuthController(UserRepository userRepo,BCryptPasswordEncoder encoder) {
	 this.userRepo=userRepo;
	 this.encoder=encoder;
	}
	
 @PostMapping
 public String register(@RequestBody User user) {
	user.setPassword(encoder.encode(user.getPassword()));
	userRepo.save(user);
	return "User Registered";
 }
}
