package com.fita.trainingacademy.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer courseId;
	
	private String courseName;
	private Integer duration;
	
	@Column(name="trainer_id")
	private Integer trainerId;
	
	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	
	public Integer getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(Integer trainerId) {
		this.trainerId = trainerId;
	}

	public Course(Integer courseId, String courseName, Integer duration, Integer trainerId) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.duration = duration;
		this.trainerId=trainerId;
	}
}
