package com.techlabs.array;

public class TestIntergerArray {

	public static void main(String[] args) {

		int no = 10;
		ChangeToZero(no);
		System.out.println(no);

		int[] nos = { 10, 20, 30 };
		ChangeToZero(nos);
		for (int number : nos) {
			System.out.println(number);
		}
	}

	static void ChangeToZero(int no) {
		no = 0;
	}

	static void ChangeToZero(int[] nos) {
		for (int i = 0; i < nos.length; i++) {
			nos[i] = 0;
		}
	}
}
