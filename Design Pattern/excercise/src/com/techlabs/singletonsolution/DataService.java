package com.techlabs.singletonsolution;

public class DataService {
	private static DataService dataService;

	private DataService() {
		System.out.println("Data service Created");
	}

	public void doSomthing() {
		System.out.println("Doing Some By " + this.hashCode());
	}

	public static DataService getInstance() {
		if (dataService == null) {
			dataService = new DataService();
		}
		return dataService;
	}
}
