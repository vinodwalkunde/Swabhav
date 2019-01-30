package com.techlabs.singletonproblem.test;

import com.techlabs.singletonproblem.DataService;

public class TestDataService {

	public static void main(String[] args) {
		DataService dataService = DataService.getInstance();
		dataService.doSomthing();

		DataService dataService2 = DataService.getInstance();
		dataService2.doSomthing();

		System.out.println(dataService.hashCode());
		System.out.println(dataService2.hashCode());
	}

}
