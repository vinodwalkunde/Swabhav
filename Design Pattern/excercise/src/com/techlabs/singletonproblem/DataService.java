package com.techlabs.singletonproblem;

public class DataService {
	private DataService() {
		System.out.println("Data service Created");
	}

	public void doSomthing() {
		System.out.println("Doing Some By " + this.hashCode());
	}

	public static DataService getInstance() {
		return new DataService();
	}
}
