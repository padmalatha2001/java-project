package com.crnts.embededClasses;

import javax.persistence.Embeddable;

@Embeddable
public class StudentAdditionalDetails {
	
	private String address;
	private  char grade;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	

}
