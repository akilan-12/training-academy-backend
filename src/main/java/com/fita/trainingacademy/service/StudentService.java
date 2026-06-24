package com.fita.trainingacademy.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fita.trainingacademy.bean.Course;
import com.fita.trainingacademy.bean.Student;
import com.fita.trainingacademy.dto.StudentDTO;
import com.fita.trainingacademy.dto.TrainerStudentDTO;
import com.fita.trainingacademy.repository.CourseRepository;
import com.fita.trainingacademy.repository.StudentRepository;
import com.fita.trainingacademy.repository.TrainerRepository;

@Service
public class StudentService {
	@Autowired
    private StudentRepository studentRepo;
	@Autowired
	private TrainerRepository trainerRepo;
	@Autowired
	private CourseRepository courseRepo;
	
//	Get ALL
	public List<StudentDTO> getAllStudents(){
		List<Student> students=studentRepo.findAll();
		List<StudentDTO> dtoList=new ArrayList<>();
		
		for(Student s:students) {
			
			StudentDTO dto=new StudentDTO();
			dto.setStudentId(s.getStudentId());
			dto.setStudentName(s.getStudentName());
			dto.setQualification(s.getQualification());
			dto.setTrainerId(s.getTrainerId());
			dto.setCourseId(s.getCourseId());
			
			if(s.getTrainerId()!=null) {
				trainerRepo.findById(s.getTrainerId()).ifPresent(t->dto.setTrainerName(t.getTrainerName()));
			}
			
			if(s.getCourseId()!=null) {
				courseRepo.findById(s.getCourseId()).ifPresent(c->dto.setCourseName(c.getCourseName()));
			}
			dtoList.add(dto);
		}
		return dtoList;
	}
	
//  Create
	public Student createStudent(StudentDTO dto) {
		Student s=new Student();
		s.setCourseId(dto.getCourseId());
		s.setQualification(dto.getQualification());
		s.setTrainerId(dto.getTrainerId());
		s.setStudentName(dto.getStudentName());
		
		return studentRepo.save(s);
	}
	
//  update
	public Student updateStudent(Integer id,StudentDTO dto) {
		Student s=studentRepo.findById(id).orElseThrow(()->new RuntimeException("Student not found"));
		s.setStudentName(dto.getStudentName());
		s.setQualification(dto.getQualification());
		s.setTrainerId(dto.getTrainerId());
		s.setCourseId(dto.getCourseId());
		
		return studentRepo.save(s);
	}
	
//  delete
	public void deleteStudent(Integer id) {
		studentRepo.deleteById(id);
	}
	
	
	public List<TrainerStudentDTO> getStudentsByTrainerId(Integer trainerId){
		return studentRepo.findByTrainerId(trainerId)
				.stream()
				.map(student->{ 
				String courseName=null;
				
				if(student.getCourseId()!=null) {
					courseRepo.findById(student.getCourseId())
					.ifPresent(c->{});
					courseName=courseRepo.findById(student.getCourseId())
							.map(Course::getCourseName)
							.orElse(null);
				}
				return new TrainerStudentDTO(
						student.getStudentId(),
						student.getStudentName(),
						student.getQualification(),
						courseName);
				}).toList();
	}
	}

