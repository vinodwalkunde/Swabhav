package com.techlabs.array;

public class TestArguments {

	public static void main(String[] args) {

		// System.out.println(args.length);

		if (args.length != 0) {
			for (String names : args) {
				System.out.println("Hello " + names);
			}

		} else {
			System.err.println("Please pass Argument");
		}
		System.out.println("Thank You");

	}

}
