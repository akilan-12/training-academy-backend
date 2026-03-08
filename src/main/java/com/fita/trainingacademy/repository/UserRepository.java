package com.fita.trainingacademy.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fita.trainingacademy.bean.User;

public interface UserRepository extends JpaRepository<User,Integer>{
	Optional<User> findByUsername(String username);
}
