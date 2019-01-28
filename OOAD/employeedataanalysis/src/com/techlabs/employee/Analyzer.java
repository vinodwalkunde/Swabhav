package com.techlabs.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Analyzer {
	private Parser dataParser;

	public Analyzer(Parser dataParser) {
		this.dataParser = dataParser;
	}

	public Employee MaxSalary() {
		Set<Employee> setEmployee;
		setEmployee = dataParser.getEmpDataSet();
		List<Employee> listEmployee = new ArrayList<Employee>(setEmployee);

		return listEmployee.get(listEmployee.size() - 1);
	}

	public int TotalNumberEmployee() {
		Set<Employee> setEmployee;
		setEmployee = dataParser.getEmpDataSet();
		return setEmployee.size();

	}

	public void numberOfEmployeeByDepartment() {
		Set<Employee> setEmployee;
		setEmployee = dataParser.getEmpDataSet();

	}
}
