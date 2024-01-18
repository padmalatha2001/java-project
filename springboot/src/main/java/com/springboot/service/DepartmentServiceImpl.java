package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.springboot.model.Department;
import com.springboot.repository.DeportmentRepository;



@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	DeportmentRepository departmentRepository;
	@Override
	public void save(Department department) {
		// TODO Auto-generated method stub
		departmentRepository.save(department);
	}

	@Override
	public Department get(Long id) {
		// TODO Auto-generated method stub
		return departmentRepository.getReferenceById(id);
	}

//	@Override
//	public Department update(Department department) {
//		// TODO Auto-generated method stub
//		return departmentRepository.;
//	}

	@Override
	public List<Department> getAll() {
		// TODO Auto-generated method stub
		return departmentRepository.findAll(Sort.by(Direction.DESC,"id"));
	}

	@Override
	public Department findByName(String name) {
		// TODO Auto-generated method stub
		return departmentRepository.findByName(name);
	}

}
