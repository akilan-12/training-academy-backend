package com.fita.trainingacademy.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fita.trainingacademy.bean.Course;
import com.fita.trainingacademy.dto.CourseDTO;
import com.fita.trainingacademy.bean.Trainer;
import com.fita.trainingacademy.repository.CourseRepository;
import com.fita.trainingacademy.repository.TrainerRepository;
@Service
public class CourseService {
	@Autowired
    private CourseRepository courseRepo;
	@Autowired
	public TrainerRepository trainerRepo;

	public List<CourseDTO> getAllCourses(){
		return courseRepo.findAll().stream().map(this::mapToDTO).toList();
	}
	
	public Course createCourse(CourseDTO dto) {
		Course c=new Course();
		c.setCourseName(dto.getCourseName());
		c.setDuration(dto.getDuration());
		c.setTrainerId(dto.getTrainerId());
		
		return courseRepo.save(c);
	}
	
	public CourseDTO updateCourse(Integer id, CourseDTO dto) {
		Course course=courseRepo.findById(id).
				orElseThrow(()->new RuntimeException("Course not found"));
		course.setCourseName(dto.getCourseName());
		course.setDuration(dto.getDuration());
		course.setTrainerId(dto.getTrainerId());
		
		Course updated=courseRepo.save(course);
		
		return mapToDTO(updated);
	}
	
	public void deleteCourse(Integer id) {
		if(!courseRepo.existsById(id)) {
			throw new RuntimeException("Course not found");
		}
		courseRepo.deleteById(id);
	}
	
	private CourseDTO mapToDTO(Course course) {

        CourseDTO dto = new CourseDTO();
        dto.setCourseId(course.getCourseId());
        dto.setCourseName(course.getCourseName());
        dto.setDuration(course.getDuration());
        dto.setTrainerId(course.getTrainerId());

        if (course.getTrainerId() != null) {
        	Trainer trainer=trainerRepo.findById(course.getTrainerId())
                .orElse(null);
        	if(trainer!=null) {
        		dto.setTrainerName(trainer.getTrainerName());
        	}
        }

        return dto;
}
}
