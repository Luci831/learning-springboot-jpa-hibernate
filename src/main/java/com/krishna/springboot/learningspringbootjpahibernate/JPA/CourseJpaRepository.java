package com.krishna.springboot.learningspringbootjpahibernate.JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.krishna.springboot.learningspringbootjpahibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {
	
	@Autowired
	private EntityManager entityManager;
	
	public void insert(Course course)
	{
		entityManager.merge(course);
		
		//insert is merge in JPA
	}
	
	public Course findById(long id)
	{
		return entityManager.find(Course.class,id);
	}
	
	public void deleteById(long id)
	{
		Course find = entityManager.find(Course.class, id);
		
		entityManager.remove(find);
	}
	

}
