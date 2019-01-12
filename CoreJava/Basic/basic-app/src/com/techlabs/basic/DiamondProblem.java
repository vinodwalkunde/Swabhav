package com.techlabs.basic;

interface A {
	default void printFromA() {
		System.out.println("Interface A");
	}
}

interface B extends A {
	default void printFromB() {
		System.out.println("Interface B");
	}
}

interface C extends A {
	default void printFromC() {
		System.out.println("Interface C");
	}
}

class D implements B, C {
	public void print() {
	printFromB();
	printFromC();
	}
	
}

public class DiamondProblem {

	public static void main(String[] args) {
		D d= new D();
		d.print();
	}

}
