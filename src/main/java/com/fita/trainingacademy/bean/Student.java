package com.fita.trainingacademy.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer studentId;
	
	private String studentName;
	private String qualification;
	
	@Column(name="trainer_id")
	private Integer trainerId;
	
	
	@Column(name="course_id")
	private Integer courseId;
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public Integer getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(Integer trainerId) {
		this.trainerId = trainerId;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public Student(Integer studentId, String studentName, String qualification, Integer trainerId,
			Integer courseId) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.qualification = qualification;
		this.trainerId = trainerId;
		this.courseId = courseId;
	}
}