package com.crnts.view;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.crnts.configure.Configure;
import com.crnts.embededClasses.StudentAdditionalDetails;
import com.crnts.entity.Student;
import com.crnts.entity.StudentCredentials;
import com.crnts.service.StudentService;
import com.crnts.service.StudentServiceImpl;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Configure.class);
		HibernateTemplate templte=context.getBean(HibernateTemplate.class);
		System.out.println("configuration done");
		StudentService studentService=context.getBean(StudentService.class);	
		
		//studentService.save(new Student("Yeshoda","ece",9.2));
		//System.out.println("1 row inserted");
		//studentService.update(new Student(4,"yeshoda","mech",9.3));
		//System.out.println("1 row updated");
		
		//System.out.println(studentService.get(3));
		
		//List<Student> list=studentService.getAll();
		
		
		/*
		 * List<Student> list=studentService.getAll(); Iterator
		 * iterator=list.iterator(); while(iterator.hasNext()) {
		 * System.out.println(iterator.next()); }
		 */
		StudentCredentials studentCredentials=new StudentCredentials();
		studentCredentials.setUserName("krishna@123");
		studentCredentials.setPassword("Radha@123");
		studentService.save(studentCredentials);
		
		StudentAdditionalDetails sDetails=new StudentAdditionalDetails();
		sDetails.setAddress("Hyderabad");
		sDetails.setGrade('A');
		//studentService.save(new Student("Rukmini","eee",8.0,sDetails,studentCredentials));
	
	}

}
