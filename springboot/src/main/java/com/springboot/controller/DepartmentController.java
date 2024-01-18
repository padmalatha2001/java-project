package com.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.exception.RecordNotFoundException;
import com.springboot.model.Department;
import com.springboot.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	/*
	 * @GetMapping("/get") public String check() { return "hello"; }
	 */
	
	
	@PostMapping("/add")
	public ResponseEntity<Department> save(@RequestBody Department department) {
		System.out.println("coming");
		 //log.info("Save Department {}",department);
		departmentService.save(department);
		ResponseEntity<Department> responseEntity = new ResponseEntity<>(department, HttpStatus.CREATED);
		return responseEntity;
	}

	@GetMapping("/getById/{id}")
	public ResponseEntity<Department> get(@PathVariable Long id) {
		Department department = departmentService.get(id);

			ResponseEntity<Department> responseEntity = new ResponseEntity<>(department, HttpStatus.OK);
		    return responseEntity;		
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Department>> get(){
		List<Department> departments=departmentService.getAll();
		ResponseEntity<List<Department>> responseEntity=new ResponseEntity<>(departments,HttpStatus.OK);
		return responseEntity;
		
	}
	
	@GetMapping(path = "{name}")
	public ResponseEntity<Department> get(@PathVariable String name) {
		Department department = departmentService.findByName(name);

			ResponseEntity<Department> responseEntity = new ResponseEntity<>(department, HttpStatus.OK);
		    return responseEntity;		
	}
}
