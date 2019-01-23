package com.techlabs.set;

import java.util.HashSet;

public class HashSetCURD {

	public static void main(String[] args) {
		HashSet<Integer> hashset = new HashSet<Integer>();
		hashset.add(10);
		hashset.add(20);
		hashset.add(30);
		hashset.add(40);
		Integer i=new Integer(50);
		
		hashset.add(i);
		
		hashset.remove(i);
		
		for (Integer integer : hashset) {
			System.out.println(integer);
		}
	}

}
