package com.crnts.view;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.crnts.configure.Configure;
import com.crnts.courses.service.CourseService;
import com.crnts.embededClasses.StudentAdditionalDetails;
import com.crnts.entity.Student;
import com.crnts.entity.StudentCredentials;
import com.crnts.entity.courses.*;
import com.crnts.service.StudentService;

public class OneToMany {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Configure.class);
		CourseService courseService=context.getBean(CourseService.class);
		HibernateTemplate templte=context.getBean(HibernateTemplate.class);
		StudentService studentService=context.getBean(StudentService.class);
		Student student =new Student();
		student.setName("krishna");
		student.setBranch("cse");
		student.setCgpa(9.5);
		
		StudentAdditionalDetails studentAdditionalDetails=new StudentAdditionalDetails();
		studentAdditionalDetails.setAddress("Benglore");
		studentAdditionalDetails.setGrade('A');
		
		student.setStDetails(studentAdditionalDetails);
		
		
		List<Course> courses=new ArrayList();
		
		Course course1=new Course();
		course1.setName("Java");
	    courseService.save(course1);
	    courses.add(course1);
	    
	    Course course2=new Course();
	    course2.setName("Python");
	    courseService.save(course2);
	    courses.add(course2);
	    
	    Course course3=new Course();
	    course3.setName("DotNet");
	    courseService.save(course3);
	    courses.add(course3);
		
		student.setCourses(courses);
		
		studentService.save(student);
		
	}

}
