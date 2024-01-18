package com.crnts.service;

import java.util.List;

import com.crnts.entity.Student;
import com.crnts.repository.*;
public class StudentServiceImpl implements StudentService{

	StudentDAO studentDAO=new StudentDAOImpl(); 
	@Override
	public void save(Student student) {
		// TODO Auto-generated method stub
		studentDAO.save(student);
	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
		studentDAO.update(student);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		studentDAO.delete(id);
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		
		return studentDAO.getStudent(id);
	}

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return studentDAO.getAll();
	}

}
