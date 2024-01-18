package com.crnts.service;

import java.util.List;

import com.crnts.entity.Student;
import com.crnts.entity.StudentCredentials;

public interface StudentService {

	Student save(Student student);
	Student update(Student student);
	Student get(int id);
	List<Student> getAll();
	StudentCredentials save( StudentCredentials studentCredentials);
}
