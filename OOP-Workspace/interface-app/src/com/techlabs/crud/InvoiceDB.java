package com.techlabs.crud;

public class InvoiceDB implements ICrudable {

	@Override
	public void create() {
		System.out.println("Invoice Created");
	}

	@Override
	public void read() {
		System.out.println("Read From Invoice");
	}

	@Override
	public void update() {
		System.out.println("Update From Invoice");
	}

	@Override
	public void delete() {
		System.out.println("Delete From Invoice");
	}

	public void modify() {
		System.out.println("Modify Invoice");
	}
	public void add() {
		System.out.println("Add Invoice");
	}

}
