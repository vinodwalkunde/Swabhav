package com.techlabs.dogdoor;

public class DogDoor {
	private boolean open;

	public DogDoor(boolean open) {
		this.open = open;
	}

	public DogDoor() {
		this(false);
	}

	public void open() {
		System.out.println("The Dog Door Opens....");
		open = true;
	}

	public void close() {
		System.out.println("The Dog Door Closes....");
		open = false;
	}

	public boolean isOpen() {
		return open;

	}
}
