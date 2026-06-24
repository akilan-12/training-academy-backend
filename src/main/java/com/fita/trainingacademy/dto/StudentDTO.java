package com.fita.trainingacademy.dto;

public class StudentDTO {
	private Integer studentId;
	private String studentName;
	private String qualification;
	
	private Integer trainerId;
	private String trainerName;
	
	private Integer courseId;
	private String courseName;
	
	public StudentDTO() {
		// TODO Auto-generated constructor stub
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
	
	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public StudentDTO(String studentName, String qualification, Integer trainerId, Integer courseId, Integer studentId, String trainerName, String courseName) {
		super();
		this.studentName = studentName;
		this.qualification = qualification;
		this.trainerId = trainerId;
		this.studentId=studentId;
		this.courseId = courseId;
		this.studentName=studentName;
		this.courseName=courseName;
		this.trainerName=trainerName;
	}

}