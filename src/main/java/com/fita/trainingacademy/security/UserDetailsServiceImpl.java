package com.fita.trainingacademy.security;

import org.springframework.beans.factory.annotation.Autowired;
import com.fita.trainingacademy.bean.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.fita.trainingacademy.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user= userRepository.findByUsername(username)
				.orElseThrow(()->
				new UsernameNotFoundException("User not found:"+ username));
		System.out.println("User lookup: "+ username);
		return org.springframework.security.core.userdetails.User
				.withUsername(user.getUsername())
				.password(user.getPassword())
				.roles(user.getRole())
				.build();
	}

}
