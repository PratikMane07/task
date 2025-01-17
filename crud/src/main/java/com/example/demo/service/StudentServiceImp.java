package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repositary.StudentRepositary;

@Service
public class StudentServiceImp  implements StudentService{

	@Autowired
	StudentRepositary sr;
	
	
	
	@Override
	public Student saveStudent(Student s) {
		Student stud = sr.save(s);
		return stud;
	}

}
