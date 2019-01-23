package com.techlabs.set;

import java.util.LinkedHashSet;

public class LinkedHashSetCURD {

	public static void main(String[] args) {
		LinkedHashSet<Integer> linkedset = new LinkedHashSet<>();
		linkedset.add(100);
		linkedset.add(20);
		linkedset.add(30);
		linkedset.add(40);
		
		linkedset.remove(100);
		for (Integer integer : linkedset) {
			System.out.println(integer);
		}
	}

}
