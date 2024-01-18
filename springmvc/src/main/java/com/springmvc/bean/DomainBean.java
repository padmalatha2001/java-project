package com.springmvc.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


public class DomainBean implements Serializable{

	
	private long id;
	private String name;
	private int employee_count;
	
	
	public DomainBean(long id, String name, int employee_count) {
		super();
		this.id = id;
		this.name = name;
		this.employee_count = employee_count;
	}
	
	
	public DomainBean(String name, int employee_count) {
		super();
		this.name = name;
		this.employee_count = employee_count;
	}


	public DomainBean() {
		super();
		// TODO Auto-generated constructor stub
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmployee_count() {
		return employee_count;
	}
	public void setEmployee_count(int employee_count) {
		this.employee_count = employee_count;
	}


	@Override
	public String toString() {
		return "Domain [id=" + id + ", name=" + name + ", employee_count=" + employee_count + "]";
	}
	
	
	
}
