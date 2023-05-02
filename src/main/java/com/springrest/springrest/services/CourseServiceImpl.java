package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	
	ArrayList<Course> list;
	
	public CourseServiceImpl() {
		list = new ArrayList<Course>();
		list.add(new Course(145, "Java Course ", "this is  a importanat course of java"));
		list.add(new Course(165, "Java core Course ", "this is  a importanat course of java"));
		list.add(new Course(245, "Java ", "this is  a importanat course of java"));
	}
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

}
