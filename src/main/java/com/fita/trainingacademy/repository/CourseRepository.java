package com.fita.trainingacademy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fita.trainingacademy.bean.Course;
@Repository
public interface CourseRepository extends JpaRepository<Course,Integer>{
	
}
