package com.springboot.service;

import java.util.List;

import com.springboot.model.Department;

public interface DepartmentService {

	void save(Department department);
	Department get(Long id);
	//Department update(Department department);
	List<Department> getAll();
    Department findByName(String name);
}
