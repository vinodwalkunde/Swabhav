package com.techlabs.linklist;

public class LinkedList<T> {
	private Node head;
	private int listCount;

	public LinkedList() {
		head = new Node(0);
		listCount = 0;
	}

	public void print() {
		Node current = head;
		while (current.getNext() != null) {
			System.out.println(current.getData());
			current = current.getNext();
		}
		System.out.println(current.getData());
	}

	public void add(int d) {
		Node end = new Node(d);
		Node current = head;

		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(end);
		listCount++;
	}
	 public void deleteNodeWithData(T d){
	    	Node current = head;
	        while(current.getNext()!=null){
	            if(current.getNext().getData()==d){
	                current.setNext(current.getNext().getNext());
	                listCount--;
	            }
	            current = current.getNext();
	        }
	        System.out.println("Delete Failed: No node found with given data!");
	    }

}
