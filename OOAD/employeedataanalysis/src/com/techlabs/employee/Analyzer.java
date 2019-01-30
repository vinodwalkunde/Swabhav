package com.techlabs.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Analyzer {
	private Parser dataParser;
	Map<String, Integer> mapOfDesignation = new TreeMap<String, Integer>();
	Map<Integer, Integer> mapOfDepartment = new TreeMap<Integer, Integer>();

	public Analyzer(Parser dataParser) {
		this.dataParser = dataParser;
	}

	public Employee MaxSalary() {
		Set<Employee> setEmployee;
		setEmployee = dataParser.getEmpDataSet();
		List<Employee> listEmployee = new ArrayList<Employee>(setEmployee);
		Comparator<Employee> sortbySalary = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o1.getSalary() - o2.getSalary());
			}
		};
		Collections.sort(listEmployee, sortbySalary);
		return listEmployee.get(listEmployee.size() - 1);

	}

	public int TotalNumberEmployee() {
		Set<Employee> setEmployee;
		setEmployee = dataParser.getEmpDataSet();
		return setEmployee.size();

	}

	public Map<String, Integer> numberOfEmployeeByDesignation() {
		Set<Employee> setEmployee;
		setEmployee = dataParser.getEmpDataSet();

		for (Employee emp : setEmployee) {
			addDataInMapDesignation(emp);
		}
		return mapOfDesignation;
	}

	public Map<Integer, Integer> numberOfEmployeeByDepartment() {
		Set<Employee> setEmployee;
		setEmployee = dataParser.getEmpDataSet();

		for (Employee emp : setEmployee) {
			addDataInMapDepartment(emp);
		}
		return mapOfDepartment;
	}

	public void addDataInMapDesignation(Employee employee) {
		if (mapOfDesignation.get(employee.getDesignation()) == null) {
			mapOfDesignation.put(employee.getDesignation(), 1);
			
		} else {
			int counter = mapOfDesignation.get(employee.getDesignation());
			counter++;
			mapOfDesignation.put(employee.getDesignation(), counter);
		}
	}

	public void addDataInMapDepartment(Employee employee) {
		if (mapOfDepartment.get(employee.getDepartment()) == null) {
			mapOfDepartment.put(employee.getDepartment(), 1);
			
		} else {
			int counter = mapOfDepartment.get(employee.getDepartment());
			counter++;
			mapOfDepartment.put(employee.getDepartment(), counter);
		}
	}
}
