package com.techlabs.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IDiskItem {
	private String name;
	private List<IDiskItem> items;

	public Folder(String name) {
		items = new ArrayList<IDiskItem>();
		this.name = name;
	}

	public void addItems(IDiskItem diskItem) {
		items.add(diskItem);
	}

	@Override
	public void display() {

		System.out.println(name);
		System.out.print(" ");
		for (IDiskItem diskItem : items) {
			System.out.print(" ");
			diskItem.display();
		}
	}

}
