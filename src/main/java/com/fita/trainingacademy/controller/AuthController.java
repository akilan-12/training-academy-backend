package com.fita.trainingacademy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fita.trainingacademy.bean.User;
import com.fita.trainingacademy.repository.UserRepository;

@RestController
@RequestMapping("/auth")
public class AuthController {
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private UserRepository userRepository;

	
 @PostMapping("/register")
 public String register(@RequestBody User user) {
	user.setPassword(passwordEncoder.encode(user.getPassword()));
	userRepository.save(user);
	return "User Registered successfully";
 }
 
 @GetMapping("/me")
 public ResponseEntity<?> me(@AuthenticationPrincipal UserDetails userDetails){
	 return ResponseEntity.ok(userDetails);
 }
}
