package com.crnts.repository;

import java.util.List;
import java.util.Optional;

import com.crnts.entity.Student;
import com.crnts.entity. StudentCredentials;
public interface StudentRepository {

	Student save(Student student);
	Student update(Student student);
	Optional<Student> get(int id);
	List<Student> getAll();
	StudentCredentials save( StudentCredentials studentCredentials);
}
