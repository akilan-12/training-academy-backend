package com.fita.trainingacademybackend.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http)throws Exception{
		
		http
		.csrf(csrf->csrf.disable())
		.authorizeHttpRequests(auth->auth
//				.requestMatchers("/auth/**").permitAll()
//				.requestMatchers("/trainers/**").hasAnyRole("ADMIN","STAFF")
//				.requestMatchers("/students/**").hasAnyRole("ADMIN","STAFF","TRAINER")
//				.requestMatchers("/courses/**").hasRole("ADMIN")
//				.anyRequest().authenticated()
//				)
				.requestMatchers(
//						"/login",
//						"/register",
//						"/trainers/**",
//						"/students/**",
//						"/courses/**"
						"/**"
						)
				.permitAll()
				.anyRequest()
				.authenticated()
				)
		.httpBasic(withDefaults());
//		.formLogin(form->form
//				.defaultSuccessUrl("/dashboard",true)
//				.permitAll()
//				)
//		.logout(logout->logout.permitAll());
		return http.build();	
	}

}
