package com.fita.trainingacademy.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Trainer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer trainerId;
	
	private String trainerName;
	private Integer yearOfExperience;
	
	public Trainer() {
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

	public Trainer(Integer trainerId, String trainerName, Integer yearOfExperience) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.yearOfExperience = yearOfExperience;
	}
}
