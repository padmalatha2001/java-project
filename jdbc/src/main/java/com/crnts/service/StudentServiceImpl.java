package com.crnts.service;

import com.crnts.entity.Student;

import java.util.List;

import com.crnts.dao.StudentDAO;
import com.crnts.dao.StudentDAOImpl;

public class StudentServiceImpl implements StudentService{

	StudentDAO studentDAO =new StudentDAOImpl();
	
	@Override
	public void insert(Student s) {
		// TODO Auto-generated method stub
		studentDAO.insert(s);
	}
	
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		studentDAO.delete(id);
	}
	
	@Override
	public void updateBranch(int id, String branch) {
		// TODO Auto-generated method stub
		studentDAO.updateBranch(id, branch);
	}

	@Override
	public List<Student>  getAll() {
		// TODO Auto-generated method stub
		return studentDAO.getAll();
	}

	@Override
	public Student getById(int id) {
		// TODO Auto-generated method stub
		return studentDAO.getById(id);
	}

	

}
