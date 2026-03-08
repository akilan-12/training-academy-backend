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

import com.fita.trainingacademy.bean.Student;
import com.fita.trainingacademy.dto.StudentDTO;
import com.fita.trainingacademy.dto.TrainerStudentDTO;
import com.fita.trainingacademy.service.StudentService;

@RestController
@RequestMapping("/students")
@CrossOrigin("*")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@GetMapping
    public List<StudentDTO> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping
    public Student addStudent(@RequestBody StudentDTO dto) {
        return studentService.createStudent(dto);
    }

    @PutMapping("/{id}")
    public Student updateStudent(
            @PathVariable Integer id,
            @RequestBody StudentDTO dto) {
        return studentService.updateStudent(id, dto);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Integer id) {
        studentService.deleteStudent(id);
        return "Student deleted successfully";
    }
    
    @GetMapping("/trainer/{trainerId}")
    public List<TrainerStudentDTO> getStudentsByTrainer(@PathVariable Integer trainerId){
    	return studentService.getStudentsByTrainerId(trainerId);
    }
}
