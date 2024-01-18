package com.crnts.office.feuji.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="domain")
public class Domain {

	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	//private long id;
	private String name;
	private int employee_count;
	
	
	public Domain(String name, int employee_count) {
		super();
		//this.id = id;
		this.name = name;
		this.employee_count = employee_count;
	}
	
	
	public Domain() {
		super();
		// TODO Auto-generated constructor stub
	}


//	public long getId() {
//		return id;
//	}
//	public void setId(long id) {
//		this.id = id;
//	}
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
		return "Domain [ name=" + name + ", employee_count=" + employee_count + "]";
	}
	
	
	
}
