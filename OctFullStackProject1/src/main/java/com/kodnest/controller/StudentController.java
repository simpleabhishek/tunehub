package com.kodnest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodnest.entity.Student;
import com.kodnest.service.StudentService;

@RestController
public class StudentController 
{
	@Autowired
	StudentService studentService;
	
	@GetMapping(value="/message")
	public String getMessage()
	{
		return "Hello";
	}
	
	@GetMapping(value="/studentdetails")
	public List<Student> getStudentDetails()
	{
		return studentService.getStudent();
	}
}
