package com.crnts.entity;

public class Student {

	 private int id;
	 private String name;
	 private String branch;
	 private double cgpa;
	 
	 
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student( String name, String branch, double cgpa) {
		super();
		this.name = name;
		this.branch = branch;
		this.cgpa = cgpa;
	}

	
	public Student(int id, String name, String branch, double cgpa) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.cgpa = cgpa;
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

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", branch=" + branch + ", cgpa=" + cgpa + "]";
	}
	 
	
	 

}
