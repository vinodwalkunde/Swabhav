package com.techlabs.crud;

public class CustomerDB implements ICrudable {

	@Override
	public void create() {
		System.out.println("Customer created");
	}

	@Override
	public void read() {
		System.out.println("Read From Customer DB");
	}

	@Override
	public void update() {
		System.out.println("Update From Customer DB");
	}

	@Override
	public void delete() {
		System.out.println("Delete from Customer DB");
	}

	public void insert() {
		System.out.println("Insert To Customer DB");
	}

	public void add() {
		System.out.println("Add To Customer DB");
	}

}
