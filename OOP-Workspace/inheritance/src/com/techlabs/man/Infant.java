package com.techlabs.man;

public class Infant extends Man {
	public Infant() {
		System.out.println("Infant Created");
	}
	@Override
	public void play() {
		System.out.println("Infant Playing");
	}
}
