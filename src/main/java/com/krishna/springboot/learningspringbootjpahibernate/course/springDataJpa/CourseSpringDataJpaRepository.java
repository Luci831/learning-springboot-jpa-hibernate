package com.krishna.springboot.learningspringbootjpahibernate.course.springDataJpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krishna.springboot.learningspringbootjpahibernate.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long>{
	
	List<Course> findByAuthor(String author);//Custom methods for JPA
	
	List<Course> findByName(String name);
	

}
