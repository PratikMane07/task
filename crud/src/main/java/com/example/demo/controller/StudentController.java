package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService ss;

	@PostMapping("/add")
	public ResponseEntity<Student> addStudent(@RequestBody Student s)
	{
		Student student= ss.saveStudent(s);
		return new ResponseEntity<Student>(student,HttpStatus.OK);
		
	}
}
