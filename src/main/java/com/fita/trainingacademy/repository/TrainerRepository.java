package com.fita.trainingacademy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fita.trainingacademy.bean.Trainer;
@Repository
public interface TrainerRepository extends JpaRepository<Trainer, Integer> {
	
}
