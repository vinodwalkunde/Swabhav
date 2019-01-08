package com.techlabs.basic;

public class ImmutableString {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="Hello";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		s1.concat("World");
		System.out.println(s1);
		
	}

}
