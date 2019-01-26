package com.techlabs.bark;

import com.techlabs.dogdoor.DogDoor;

public class BarkRecognizer {
	private DogDoor door;

	public BarkRecognizer(DogDoor door) {
		this.door = door;
	}

	public void recognize(String bark) {
		System.out.println("   BarkRecognizer: Heard a '" + bark + "'");
		door.open();
	}
}
