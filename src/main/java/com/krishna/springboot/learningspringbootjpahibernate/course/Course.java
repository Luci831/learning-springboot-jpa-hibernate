package com.krishna.springboot.learningspringbootjpahibernate.course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="Course_Detail")
public class Course {
	
	@Id
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="author")
	private String author;
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	
	
	}
	
	


