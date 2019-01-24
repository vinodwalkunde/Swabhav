package com.techlabs.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.techlabs.employee.Employee;

public class TestHashMap {
	public static void main(String[] args) {
		Employee employee = new Employee(101, 10, "Vinod", "Walkunde", 50000);
		Employee employee1 = new Employee(101, 10, "Vinod", "Walkunde", 50000);
		Employee employee2 = new Employee(101, 20, "Vinod", "Walkunde", 50000);
		Employee employee3 = new Employee(102, 10, "Rohit", "Pawar", 30000);

		Map<Employee, Employee> employeeMap = new HashMap<Employee, Employee>();
		employeeMap.put(employee, employee);
		employeeMap.put(employee1, employee1);
		employeeMap.put(employee2, employee2);
		employeeMap.put(employee3, employee3);

		System.out.println(employeeMap.size());

		for (Employee emp : employeeMap.keySet()) {
			System.out.println(emp.hashCode() + " " + emp.getFirstName());
		}
		for (Map.Entry<Employee, Employee> entry : employeeMap.entrySet())
			System.out.println(
					"Key = " + entry.getKey().getDeptNumber() + ", Value = " + entry.getValue().getEmpNumber());
	}
}
