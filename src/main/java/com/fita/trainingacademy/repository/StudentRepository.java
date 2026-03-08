package com.fita.trainingacademy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fita.trainingacademy.bean.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	List<Student> findByTrainerId(Integer trainerId);
}
