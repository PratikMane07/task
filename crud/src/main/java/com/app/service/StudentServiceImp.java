package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Student;
import com.app.repositary.StudentRepositary;

@Service
public class StudentServiceImp  implements StudentService{

	@Autowired
	StudentRepositary sr;
	
	
	@Override
	public Student saveStudent(Student s) {
		Student st=sr.save(s);
		return st;
	}

}
