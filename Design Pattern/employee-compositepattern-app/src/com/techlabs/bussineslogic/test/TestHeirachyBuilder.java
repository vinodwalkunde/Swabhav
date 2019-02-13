package com.techlabs.bussineslogic.test;

import java.util.ArrayList;
import java.util.Set;

import com.techlabs.bussineslogic.Employee;
import com.techlabs.bussineslogic.EmployeeHeirarchyBuilder;
import com.techlabs.bussineslogic.EmployeeParser;
import com.techlabs.bussineslogic.FileLoader;

public class TestHeirachyBuilder {

	public static void main(String[] args) throws Exception {
		FileLoader fileLoader=new FileLoader("dataFile.txt");
		ArrayList<String> list=fileLoader.loadFile();
		
		EmployeeParser employeeParser=new EmployeeParser();
		Set<Employee> empSet=employeeParser.parse(list);
		
		EmployeeHeirarchyBuilder heirarchyBuilder=new EmployeeHeirarchyBuilder(empSet);
		Employee root=heirarchyBuilder.getRoot();
		root.display();
	}

}
