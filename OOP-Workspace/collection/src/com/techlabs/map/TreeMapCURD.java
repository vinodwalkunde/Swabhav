package com.techlabs.map;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapCURD {

	public static void main(String[] args) {
		TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();

		treeMap.put(1, 100);
		treeMap.put(2, 200);
		treeMap.put(3, 300);
		treeMap.put(4, 400);

		Set<Integer> set = treeMap.keySet();
		for (Integer integer : set) {
			System.out.println(integer);
		}

	}

}
