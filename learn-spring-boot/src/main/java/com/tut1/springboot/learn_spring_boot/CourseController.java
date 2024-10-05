package com.tut1.springboot.learn_spring_boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	// Courses
	// Course : Id , name , author
	// Creating methods
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				new Course(1, "Learn AWS", "ByTeacher1"),
				new Course(2, "Learn Devops", "ByTeacher2"),
				new Course(3, "Learn Azur", "ByTeacher3"),
				new Course(4, "Learn GCP", "ByTeacher4")
				);
	}
}
