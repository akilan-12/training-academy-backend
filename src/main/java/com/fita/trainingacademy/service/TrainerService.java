package com.fita.trainingacademy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fita.trainingacademy.bean.Trainer;
import com.fita.trainingacademy.dto.TrainerDTO;
import com.fita.trainingacademy.repository.TrainerRepository;


@Service
public class TrainerService {
	    @Autowired
	    private TrainerRepository trainerRepo;

	   
	    
	    public List<TrainerDTO> getAllTrainers() {
	        return trainerRepo.findAll()
	                .stream()
	                .map(this::convertToDTO)
	                .toList();
	    }

	    /* ---------- CREATE ---------- */
	    public TrainerDTO saveTrainer(TrainerDTO dto) {
	        Trainer trainer = new Trainer();
	        trainer.setTrainerName(dto.getTrainerName());
	        trainer.setYearOfExperience(dto.getYearOfExperience());

	        Trainer saved = trainerRepo.save(trainer);
	        return convertToDTO(saved);
	    }
	    
	    public TrainerDTO updateTrainer(Integer id, TrainerDTO dto) {
	        Trainer trainer = trainerRepo.findById(id)
	                .orElseThrow(() -> new RuntimeException("Trainer not found"));

	        trainer.setTrainerName(dto.getTrainerName());
	        trainer.setYearOfExperience(dto.getYearOfExperience());

	        Trainer updated = trainerRepo.save(trainer);
	        return convertToDTO(updated);
	    }

	    /* ---------- DELETE ---------- */
	    public void deleteTrainer(Integer id) {
	        trainerRepo.deleteById(id);
	    }

	    /* ---------- ENTITY → DTO ---------- */
	    private TrainerDTO convertToDTO(Trainer trainer) {
	        return new TrainerDTO(
	                trainer.getTrainerId(),
	                trainer.getTrainerName(),
	                trainer.getYearOfExperience()
	        );
	    }
	}
