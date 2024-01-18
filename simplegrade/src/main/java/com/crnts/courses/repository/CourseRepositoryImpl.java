package com.crnts.courses.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.crnts.entity.courses.Course;

@Repository
public class CourseRepositoryImpl implements CourseRepository{

	@Autowired
	HibernateTemplate hibernateTemplate;
	@Override
	public Course save(Course course) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(course);
		return course;
	}

}
