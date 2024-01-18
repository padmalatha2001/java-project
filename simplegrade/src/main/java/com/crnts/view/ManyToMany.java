package com.crnts.view;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.crnts.configure.Configure;
import com.crnts.courses.service.CourseService;
import com.crnts.embededClasses.StudentAdditionalDetails;
import com.crnts.entity.Student;
import com.crnts.entity.courses.Course;
import com.crnts.service.StudentService;

public class ManyToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(Configure.class);
		CourseService courseService=context.getBean(CourseService.class);
		HibernateTemplate templte=context.getBean(HibernateTemplate.class);
		StudentService studentService=context.getBean(StudentService.class);
		
		Student student=new Student();
		student.setName("Krishna");
		student.setBranch("cse");
		student.setCgpa(8.0);
		
		
		StudentAdditionalDetails studentAdditionalDetails=new StudentAdditionalDetails();
		studentAdditionalDetails.setAddress("Benglore");
		studentAdditionalDetails.setGrade('A');
		
		student.setStDetails(studentAdditionalDetails);
		
		Student student1=new Student();
		student1.setName("Radha");
		student1.setBranch("mech");
		student1.setCgpa(8.0);
		student1.setStDetails(studentAdditionalDetails);
        List<Course> courses=new ArrayList();
		
		Course course1=new Course();
		course1.setName("Java");
		course1.setStudents(List.of(student,student1));
	    courseService.save(course1);
	    courses.add(course1);
	    
	    Course course2=new Course();
	    course2.setName("Python");
	    course1.setStudents(List.of(student,student1));
	    courseService.save(course2);
	    courses.add(course2);
	    
	    Course course3=new Course();
	    course3.setName("DotNet");
	    course1.setStudents(List.of(student,student1));
	    courseService.save(course3);
	    courses.add(course3);
		
		student.setCourses(courses);
		student1.setCourses(courses);
		studentService.save(student);
		studentService.save(student1);
		
	}

}
