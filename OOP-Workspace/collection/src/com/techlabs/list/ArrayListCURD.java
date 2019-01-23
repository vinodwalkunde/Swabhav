package com.techlabs.list;

import java.util.ArrayList;

public class ArrayListCURD {
	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);

		arrayList.remove(1);
		for (Integer integer : arrayList) {
			System.out.println(integer);
		}
		
		arrayList.set(1, 20);

	}
}
