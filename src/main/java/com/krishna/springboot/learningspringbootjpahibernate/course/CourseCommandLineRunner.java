package com.krishna.springboot.learningspringbootjpahibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.krishna.springboot.learningspringbootjpahibernate.JPA.CourseJpaRepository;
import com.krishna.springboot.learningspringbootjpahibernate.course.Course;
import com.krishna.springboot.learningspringbootjpahibernate.course.jdbc.CourseJDBC_REPO;
import com.krishna.springboot.learningspringbootjpahibernate.course.springDataJpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{
	
//	@Autowired
//	private CourseJDBC_REPO repo;
	
//	@Autowired
//	private CourseJpaRepository repo;
	
	@Autowired
	private CourseSpringDataJpaRepository repo;

	@Override
	public void run(String... args) throws Exception {

		repo.save(new Course(1,"JOA","Krishna"));//for springdata jpa insert=save
		//for spring JDBC insert=merge
		repo.save(new Course(2,"Docker","Sangam"));
		repo.save(new Course(3,"Kunernetes","Krishna"));
		
		repo.deleteById(1l);
		
		System.out.println(repo.findById(2l));
		
		System.out.println(repo.findByAuthor("Krishna"));
		
		System.out.println(repo.findByName("Docker"));
		
		
	}
	
//commandline runner to run something at the boot of the application
}
