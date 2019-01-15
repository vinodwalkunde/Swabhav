package com.techlabs.demo;

public class PrintOddEvenNumber {

	public static void main(String[] args) {
		System.out.println("Even Number");
		for(int i=1;i<100;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		System.out.println("Odd number");
		for(int i=1;i<100;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}

}
