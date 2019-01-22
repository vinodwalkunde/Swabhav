package com.techlabs.test.crud;

import com.techlabs.crud.CustomerDB;
import com.techlabs.crud.ICrudable;
import com.techlabs.crud.InvoiceDB;
import com.techlabs.crud.OrderDB;

public class TestCrudable {

	public static void main(String[] args) {
		doDBOperation(new InvoiceDB());
		doDBOperation(new OrderDB());
		doDBOperation(new CustomerDB());

	}

	public static void doDBOperation(ICrudable icrudable) {
		icrudable.create();
		icrudable.delete();
		icrudable.read();
		icrudable.update();
	}

}
