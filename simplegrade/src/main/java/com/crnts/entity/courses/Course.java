package com.crnts.entity.courses;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.crnts.entity.Student;

@Entity
@Table(name="courses1")
//courses for one to many
//courses1 for many to many
public class Course implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@ManyToMany(mappedBy="courses")
	private List<Student> students; 
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		//this.student = student;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name +  "]";
	}
	
	
	
}
