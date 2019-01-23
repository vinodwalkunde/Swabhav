package com.techlabs.map;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapCURD {

	public static void main(String[] args) {
		LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<Integer, Integer>();
		linkedHashMap.put(1, 100);
		linkedHashMap.put(2, 200);
		linkedHashMap.put(3, 300);
		
		Set<Integer>set=linkedHashMap.keySet();
		
		for (Integer integer : set) {
			System.out.println(integer);
		}
	}

}
