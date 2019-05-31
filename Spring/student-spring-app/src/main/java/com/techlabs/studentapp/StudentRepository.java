package com.techlabs.studentapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository("Repository")
public class StudentRepository {
	private List<Student> studentList = new ArrayList<Student>();

	public StudentRepository() {
		studentList.add(new Student("Vinod","10","007"));
		studentList.add(new Student("Ajay","11","008"));
		System.out.println("Repository Created");
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

}
