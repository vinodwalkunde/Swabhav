package com.techlabs.singleton;

public class DataService {
	private static final DataService INSTANCE = new DataService();

	private DataService() {
		System.out.println("Data service Created");
	}

	public void doSomthing() {
		System.out.println("Doing Some By " + this.hashCode());
	}

	public static DataService getInstance() {

		return INSTANCE;
	}
}
