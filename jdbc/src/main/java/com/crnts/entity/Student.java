package com.crnts.entity;

import java.util.Date;

public class Student {
      
	int id;
	String name;
	String gender;
	String branch;
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String gender, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.branch = branch;
	}

	public Student(String name, String gender, String branch) {
		super();
		this.name = name;
		this.gender = gender;
		this.branch = branch;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", branch=" + branch + "]";
	}

	
	
	
	
	
	
}
