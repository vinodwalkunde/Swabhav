package com.techlabs.basic;

import java.util.Arrays;

public class TestOverLoad {

	public static void main(String[] args) {
		System.out.print(12);
		System.out.print(12.6);
		System.out.print("Jack");
		System.out.print(true);
		System.out.print(12345667);

		System.out.println();
		System.out.println(false);
		System.out.println("Jack");
		System.out.println(14);
		System.out.println(18.44);
		
		char a='#';
		int []arry={1,2,3,4,5};
		
		printThis("Hello");
		printThis(10);
		printThis(true);
		printThis(a);
		printThis(1234567.833);
		printThis(10.23f);
		printThis(1234567445l);
		printThis(arry);

	}

	private static void printThis(String msg) {
		System.out.println(msg);
		System.out.println("String");
		System.out.println();
	}
	private static void printThis(int num){
		System.out.println(num);
		System.out.println("Int");
		System.out.println();
	}
	private static void printThis(float fnum){
		System.out.println(fnum);
		System.out.println("Float");
		System.out.println();
	}
	private static void printThis(double dnum){
		System.out.println(dnum);
		System.out.println("Double");
		System.out.println();
	}
	private static void printThis(long lnum){
		System.out.println(lnum);
		System.out.println("long");
		System.out.println();
	}
	
	private static void printThis(boolean b){
		System.out.println(b);
		System.out.println("Boolean");
		System.out.println();
	}
	private static void printThis(char c){
		System.out.println(c);
		System.out.println("Char");
		System.out.println();
	}
	private static void printThis(int[] arry){
		System.out.println(Arrays.toString(arry));
		System.out.println("Array");
	}
}
