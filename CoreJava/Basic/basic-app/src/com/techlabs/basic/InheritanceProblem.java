package com.techlabs.basic;

abstract class Animal {
	protected void eat() {
	}

	public void sleep() {
		System.out.println("Animal Sleeping");
	}
	
	public void makeNoise() {
	}

	public void roam() {
	}
}

class Dog extends Animal {
	@Override
	protected void eat() {
		System.out.println("Dog eating");
	}

	public void makeNoise() {
		System.out.println("Dog MakeNoise");
	}

	public void roam() {
		System.out.println("Dog Roaming");
	}
}

public class InheritanceProblem {

	public static void main(String[] args) {
		Animal d = new Dog();
		d.eat();
		d.makeNoise();
		d.roam();
		d.sleep();
	}

}
