package com.crnts.service;

import java.util.List;

import com.crnts.entity.Student;

public interface StudentService {

	void insert(Student s);
	void delete(int id);
	void updateBranch(int id,String branch);
	List<Student>  getAll();
	Student getById(int id);
}
