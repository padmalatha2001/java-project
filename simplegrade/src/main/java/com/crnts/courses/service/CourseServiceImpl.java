package com.crnts.courses.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crnts.courses.repository.CourseRepository;
import com.crnts.entity.courses.Course;

@Service
@Transactional
public class CourseServiceImpl implements CourseService{

	@Autowired
	private CourseRepository courseRepository;
	@Override
	public Course save(Course course) {
		// TODO Auto-generated method stub
		courseRepository.save(course);
		return course;
	}

}
