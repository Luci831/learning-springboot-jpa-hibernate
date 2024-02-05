package com.krishna.springboot.learningspringbootjpahibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.krishna.springboot.learningspringbootjpahibernate.course.Course;

//when a class talks to db we generally annotate it with @respository
@Repository
public class CourseJDBC_REPO {
	
	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
	private String Insert_Query="insert into course (id,name,author) values (?,?,?)";
	
	//? indicates values are not hardcoded
	
	public void insert(Course course)
	{
		springJdbcTemplate.update(Insert_Query,course.getId(),course.getName(),course.getAuthor());		
	}

}
