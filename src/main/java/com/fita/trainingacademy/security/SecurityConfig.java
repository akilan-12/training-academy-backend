package com.fita.trainingacademy.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.fita.trainingacademy.service.CustomUserDetailsService;

import org.springframework.beans.factory.annotation.Autowired;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Autowired
	private CustomUserDetailsService userDetailsService;
	
	public SecurityConfig(CustomUserDetailsService userDetailsService) {
		this.userDetailsService=userDetailsService;
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider authProvider=new DaoAuthenticationProvider();
		authProvider.setUserDetailsService(userDetailsService);
		authProvider.setPasswordEncoder(passwordEncoder());
		return authProvider;
	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
		
		http
		.cors(Customizer.withDefaults())
		.csrf(csrf->csrf.disable())
		.authenticationProvider(authenticationProvider())
		.authorizeHttpRequests(auth->auth
				.requestMatchers("/auth/register").permitAll()
				.requestMatchers("/auth/me").authenticated()
				.requestMatchers("/trainers/**").hasRole("ADMIN")
				.requestMatchers("/courses").hasAnyRole("ADMIN","TRAINER")
				.requestMatchers("/students/**").hasAnyRole("ADMIN","TRAINER","STUDENT")
				.anyRequest().authenticated())
		.httpBasic(Customizer.withDefaults());
		return http.build();
	}
	
}

