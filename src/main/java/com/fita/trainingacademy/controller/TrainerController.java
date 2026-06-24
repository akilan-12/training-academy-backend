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
import com.fita.trainingacademy.dto.TrainerDTO;
import com.fita.trainingacademy.service.TrainerService;

@RestController
@CrossOrigin("*")
@RequestMapping("/trainers")
public class TrainerController {
	 	@Autowired
	    private TrainerService trainerService;
	 	
	 	@GetMapping
	    public List<TrainerDTO> getAll() {
	        return trainerService.getAllTrainers();
	    }

	    @PostMapping
	    public TrainerDTO save(@RequestBody TrainerDTO dto) {
	        return trainerService.saveTrainer(dto);
	    }

	    @PutMapping("/{id}")
	    public TrainerDTO update(@PathVariable Integer id,
	                             @RequestBody TrainerDTO dto) {
	        return trainerService.updateTrainer(id, dto);
	    }

	    @DeleteMapping("/deleteById/{id}")
	    public String delete(@PathVariable Integer id) {
	        trainerService.deleteTrainer(id);
	        return "Trainer deleted";
	    }
	}
	    
