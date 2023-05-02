package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;

@RestController
public class MyController {

	@Autowired
	public CourseService courseservice;
	@GetMapping("/home")
	public String home()
	{
		return "this is home page";
	}
	
	
	//get the courses
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
		return courseservice.getCourses();
	}
}
