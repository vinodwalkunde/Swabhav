package com.techlabs.map;

import java.util.HashMap;
import java.util.Set;

public class HashMapCURD {

	public static void main(String[] args) {
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		hashmap.put(1, 100);
		hashmap.put(2, 200);
		hashmap.put(3, 300);
		hashmap.put(4, 400);

		hashmap.remove(3);
		Set<Integer> set = hashmap.keySet();

		for (Integer integer : set) {
			System.out.println(integer + " " + hashmap.get(integer));
		}
	}

}
