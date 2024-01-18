package com.crnts.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import com.crnts.entity.courses.*;
import com.crnts.embededClasses.StudentAdditionalDetails;
@NamedQueries(value = { @NamedQuery(name = "selectById", query = "from Student s where s.id=:id"),
		@NamedQuery(name = "selectAll", query = "from Student")})
@Entity
@Table(name="student2")
//Tables
//student normal crud operations
//student_details for embeded class
//student_cdetails for OneToOne mapping
//student1 for oneToMany mapping
public class Student implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="branch")
	private String branch;
	@Column(name="cgpa")
	private double cgpa;
	

//	  @OneToOne
//	  @JoinColumn(name="cred_Id",referencedColumnName="id")
//	  private StudentCredentials sCredentials;
//	 
	
	
	//@OneToMany
	//@JoinColumn(name="Student_id",referencedColumnName="id")
	//private List<Course> courses; 
	
	@ManyToMany
	@JoinTable(name="studentcourses",joinColumns= {@JoinColumn(name="stud_Id",referencedColumnName="id")},
	                 inverseJoinColumns= {@JoinColumn(name="course_id",referencedColumnName="id")})
	private List<Course> courses; 
	
	@Embedded
	@AttributeOverrides(value = { @AttributeOverride(column = @Column(name="staddress"), name = "address"),
			@AttributeOverride(column = @Column(name="stgrade"), name = "grade")})
	private StudentAdditionalDetails stDetails;
	
	
	
//	public Student( String name, String branch, double cgpa, StudentAdditionalDetails stDetails) {
//		super();
//		//this.id = id;
//		this.name = name;
//		this.branch = branch;
//		this.cgpa = cgpa;
//		this.stDetails = stDetails;
//	}
//    

//	public Student(String name, String branch, double cgpa, StudentAdditionalDetails stDetails,
//			StudentCredentials sCredentials) {
//		super();
//		this.name = name;
//		this.branch = branch;
//		this.cgpa = cgpa;
//		this.sCredentials = sCredentials;
//		this.stDetails = stDetails;
//	}


	public StudentAdditionalDetails getStDetails() {
		return stDetails;
	}


	public void setStDetails(StudentAdditionalDetails stDetails) {
		this.stDetails = stDetails;
	}


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(String name, String branch, double cgpa) {
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

    
//	public StudentCredentials getsCredentials() {
//		return sCredentials;
//	}
//
//
//	public void setsCredentials(StudentCredentials sCredentials) {
//		this.sCredentials = sCredentials;
//	}

	
	public List<Course> getCourses() {
		return courses;
	}


	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}


	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", branch=" + branch + ", cgpa=" + cgpa + ", stDetails="
				+ stDetails + "]";
	}


	
	

	/*
	 * @Override public String toString() { return "Student [id=" + id + ", name=" +
	 * name + ", branch=" + branch + ", cgpa=" + cgpa + "]"; }
	 */
	
	
	
}
