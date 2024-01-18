package com.crnts.dao;

import java.util.List;

import com.crnts.entity.Student;

public interface StudentDAO {
      
	void insert(Student s);
	void delete(int id);
	void updateBranch(int id,String branch);
	List<Student> getAll();
	Student getById(int id);
}
