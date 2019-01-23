package com.techlabs.list;

import java.util.LinkedList;

public class LinkedListCURD {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);

		linkedList.remove(2);

		for (Integer integer : linkedList) {
			System.out.println(integer);
		}

		linkedList.set(2, 30);
		linkedList.addFirst(0);
		linkedList.addLast(100);
		
		for (Integer integer : linkedList) {
			System.out.println(integer);
		}
	}

}
