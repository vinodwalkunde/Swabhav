package com.techlabs.Test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techlabs.studentapp.Student;
import com.techlabs.studentapp.StudentService;

public class TestStudentApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("appContext.xml");
		StudentService service = (StudentService) applicationContext.getBean("Service");
		List<Student> studentList = service.getAllStudent();

		System.out.println(studentList.size());
	}

}
