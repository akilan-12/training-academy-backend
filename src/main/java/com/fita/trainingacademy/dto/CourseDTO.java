package com.fita.trainingacademy.dto;

public class CourseDTO {
	
	private Integer courseId;
	private String courseName;
	private Integer duration;
	
	private Integer trainerId;
	private String trainerName;
	
	public CourseDTO() {
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

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public CourseDTO(Integer courseId, String courseName, Integer duration, Integer trainerId, String trainerName) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.duration = duration;
		this.trainerId = trainerId;
		this.trainerName = trainerName;
	}
}
