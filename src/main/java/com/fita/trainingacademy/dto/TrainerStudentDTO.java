package com.fita.trainingacademy.dto;

public class TrainerStudentDTO {

	private Integer studentId;
	private String studentName;
	private String qualification;
	private String courseName;
	
	public TrainerStudentDTO() {
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

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public TrainerStudentDTO(Integer studentId, String studentName, String qualification, String courseName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.qualification = qualification;
		this.courseName = courseName;
	}
	
}
