package com.techlabs.test.employee;

import com.techlabs.employee.Accountant;
import com.techlabs.employee.Devloper;
import com.techlabs.employee.Employee;
import com.techlabs.employee.Manger;

public class TestEmployee {

	public static void main(String[] args) {
		Devloper devloper = new Devloper("Vinod", 2);
		devloper.salary();
		getSalarySlip(devloper);

		Accountant accountant = new Accountant("Prachit", 3);
		accountant.salary();
		getSalarySlip(accountant);
		
		Manger manger=new Manger("Rohit", 5);
		manger.salary();
		getSalarySlip(manger);
	}

	public static void getSalarySlip(Employee employee) {
		System.out.println(employee);
	}

}
