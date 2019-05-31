package com.techlabs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.business.Student;
import com.techlabs.repository.StudentRepository;

@Service("Service")
public class StudentService {
	@Autowired
	StudentRepository studentRepository;

	public StudentService() {
		System.out.println("Service Created");
	}

	public List<Student> getAllStudent() {
		return studentRepository.getStudentList();

	}

	public StudentRepository getStudentRepository() {
		return studentRepository;
	}

	public void setStudentRepository(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

}
