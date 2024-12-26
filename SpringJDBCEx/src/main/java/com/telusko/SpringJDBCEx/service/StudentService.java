package com.telusko.SpringJDBCEx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.SpringJDBCEx.dao.StudentRepo;
import com.telusko.SpringJDBCEx.model.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo studentRepo; 

	public void addStudent(Student std1) {
		System.out.println("Adding...");
		studentRepo.save(std1);
	}

	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}

}
