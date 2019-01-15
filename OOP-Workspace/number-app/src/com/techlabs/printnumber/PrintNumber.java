package com.techlabs.printnumber;

public class PrintNumber {
	private int range=100;
	
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	
	public void printEven() {
		System.out.println("Even Number");
		for (int i = 1; i < range; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
	public void printOdd() {
		System.out.println("Odd number");
		for (int i = 1; i < range; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
}
