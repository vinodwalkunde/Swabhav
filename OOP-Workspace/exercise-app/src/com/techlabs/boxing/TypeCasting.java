package com.techlabs.boxing;

public class TypeCasting {

	public static void main(String[] args) {
		// Boxing
		Object object = 10;
		Integer i1 = new Integer(10);
		System.out.println(i1);

		// UnBoxing
		int value = i1;
		System.out.println(value);

		// AutoBoxing
		Character charvariable = 'a';

		// Auto-UnBoxing
		char charvar = charvariable;

		System.out.println(charvariable);
		System.out.println(charvar);
	}

}
