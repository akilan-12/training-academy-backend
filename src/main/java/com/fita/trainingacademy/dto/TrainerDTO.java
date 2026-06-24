package com.fita.trainingacademy.dto;

public class TrainerDTO {
	
	private Integer trainerId;
	private String trainerName;
	private Integer yearOfExperience;
	
	public TrainerDTO() {
		// TODO Auto-generated constructor stub
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

	public Integer getYearOfExperience() {
		return yearOfExperience;
	}

	public void setYearOfExperience(Integer yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}

	public TrainerDTO(Integer trainerId, String trainerName, Integer yearOfExperience) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.yearOfExperience = yearOfExperience;
	}
}
