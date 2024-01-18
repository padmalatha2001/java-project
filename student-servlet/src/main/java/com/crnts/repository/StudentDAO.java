package com.crnts.repository;

import java.util.List;

import com.crnts.entity.Student;

public interface StudentDAO {

	void save(Student student);
	void update(Student student);
	void delete(int id);
	Student getStudent(int id);
	List<Student> getAll();
	
	  
}
