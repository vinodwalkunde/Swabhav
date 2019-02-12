package com.techlabs.bussineslogic.test;

import java.util.ArrayList;
import java.util.Set;

import com.techlabs.bussineslogic.Employee;
import com.techlabs.bussineslogic.EmployeeHirarchy;
import com.techlabs.bussineslogic.EmployeeParser;
import com.techlabs.bussineslogic.FileLoader;

public class Test {

	public static void main(String[] args) throws Exception {
		FileLoader fileLoader=new FileLoader("dataFile.txt");
		ArrayList<String> list=fileLoader.loadFile();
		
		EmployeeParser employeeParser=new EmployeeParser();
		Set<Employee> empSet=employeeParser.parse(list);
		
		EmployeeHirarchy employeeHirarchy=new EmployeeHirarchy(empSet);
		Employee ceo=employeeHirarchy.getRootEmployee();
		ceo.display();
		
	}

}
