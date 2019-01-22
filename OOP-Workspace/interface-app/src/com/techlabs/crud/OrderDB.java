package com.techlabs.crud;

public class OrderDB implements ICrudable{

	@Override
	public void create() {
		System.out.println("Order Created");
	}

	@Override
	public void read() {
		System.out.println("Read From Order");
	}

	@Override
	public void update() {
		System.out.println("Update From Order");
	}

	@Override
	public void delete() {
		System.out.println("Delete From Order");
	}

}
