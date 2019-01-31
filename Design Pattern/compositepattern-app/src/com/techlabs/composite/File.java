package com.techlabs.composite;

public class File implements IDiskItem {
	private String name;
	private String extension;
	private int size;

	public File(String name, String extension, int size) {
		super();
		this.name = name;
		this.extension = extension;
		this.size = size;
	}

	@Override
	public void display() {
		System.out.println(name + "" + extension + "(" + size + ")");
	}

}
