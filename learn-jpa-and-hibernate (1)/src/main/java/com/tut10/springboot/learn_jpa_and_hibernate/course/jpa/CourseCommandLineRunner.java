package com.tut10.springboot.learn_jpa_and_hibernate.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.tut10.springboot.learn_jpa_and_hibernate.course.Course;
import com.tut10.springboot.learn_jpa_and_hibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{
//	@Autowired
//	private CourseJdbcRepository repository;

//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		
		// Insert is used in Spring JDBC and JPA
		//repository.insert(new Course(1, "Learn AWS Jpa", "User 1"));
		//repository.insert(new Course(2, "Learn Azure Jpa", "User 2"));
		//repository.insert(new Course(3, "Learn Devops Jpa", "User 3"));
		
		// In SpringDataJpa save is used
		repository.save(new Course(1, "Learn AWS SpringDataJpa", "User 1"));
		repository.save(new Course(2, "Learn Azure SpringDataJpa", "User 2"));
		repository.save(new Course(3, "Learn Devops SpringDataJpa", "User 3"));
		
		// In SpringDataJpa after id we have to write its type example long
		repository.deleteById(1l);
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findAll());	
		
		System.out.println(repository.count());
		
		System.out.println(repository.findByAuthor("User 2"));
		System.out.println(repository.findByAuthor(""));
		
		System.out.println(repository.findByName("Learn Devops SpringDataJpa"));
	}
}
