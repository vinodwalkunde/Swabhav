package com.techlabs.set;

import java.util.TreeSet;

public class TreeSetCURD {

	public static void main(String[] args) {
		TreeSet<Integer> treeset = new TreeSet<>();
		treeset.add(10);
		treeset.add(20);
		treeset.add(30);
		treeset.add(50);
		
		treeset.remove(30);
		
		for (Integer integer : treeset) {
			System.out.println(integer);
		}
	}

}
