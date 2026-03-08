package com.fita.trainingacademy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fita.trainingacademy.bean.Course;
import com.fita.trainingacademy.dto.CourseDTO;
import com.fita.trainingacademy.service.CourseService;

@RestController
@CrossOrigin("*")
@RequestMapping("/courses")
public class CourseController {
	 @Autowired
	 private CourseService courseService;
	
	 
	 @GetMapping
	 public List<CourseDTO> getAllCourses(){
		 return courseService.getAllCourses();
	 }
	 
	 @PostMapping
	 public Course createCourse(@RequestBody CourseDTO dto) {
		 return courseService.createCourse(dto);
	 }
	 
	 @PutMapping("/{id}")
	 public CourseDTO updateCourse(@PathVariable Integer id,@RequestBody CourseDTO dto) {
		 return courseService.updateCourse(id, dto);
	 }
	 
	 @DeleteMapping("/deleteById/{id}")
	 public void deleteCourse(@PathVariable Integer id) {
		 courseService.deleteCourse(id);
	 }
	 
	 @GetMapping("/test")
	 public String test() {
	     return "OK";
	 }

}
