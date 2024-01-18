package com.crnts.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crnts.entity.Student;
import com.crnts.entity.StudentCredentials;
import com.crnts.repository.StudentRepository;
@Service
@Transactional
public class StudentServiceImpl implements  StudentService{

	@Autowired
	StudentRepository studentRepository;
	@Override
	public Student save(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}
	@Override
	public Student update(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.update(student);
	}
	@Override
	public Student get(int id) {
		// TODO Auto-generated method stub
		Optional<Student> ostudent= studentRepository.get(id);
		Student student=ostudent.orElseThrow(()->new IllegalArgumentException("Record not Found"));
		return student;
	}
	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return studentRepository.getAll();
	}
	@Override
	public StudentCredentials save(StudentCredentials studentCredentials) {
		// TODO Auto-generated method stub
		return studentRepository.save(studentCredentials);
	}

}
