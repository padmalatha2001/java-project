package com.springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "department")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private int student_count;
	private int faculty_count;
	
	
	public Department(long id, String name, int student_count, int faculty_count) {
		super();
		this.id = id;
		this.name = name;
		this.student_count = student_count;
		this.faculty_count = faculty_count;
	}
	
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudent_count() {
		return student_count;
	}
	public void setStudent_count(int student_count) {
		this.student_count = student_count;
	}
	public int getFaculty_count() {
		return faculty_count;
	}
	public void setFaculty_count(int faculty_count) {
		this.faculty_count = faculty_count;
	}

	
}
