package com.Jpa.M2M.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Jpa.M2M.Entity.Student;
import com.Jpa.M2M.Repository.CourseRepository;
import com.Jpa.M2M.Repository.StudentRepository;

@RestController
@RequestMapping("/students/courses")
public class StudentCoursesController {
	
	private StudentRepository studentrepository;
	private CourseRepository courserepository;
	public StudentCoursesController(StudentRepository studentrepository, CourseRepository courserepository) {
		this.studentrepository = studentrepository;
		this.courserepository = courserepository;
	}
	
	@PostMapping
	public Student saveStudentWithCourse(@RequestBody Student student)
	{
		return studentrepository.save(student);
		
	}
	@GetMapping
	public List<Student> findAllStudents(){
		return  studentrepository.findAll();
	}
	
	

}
