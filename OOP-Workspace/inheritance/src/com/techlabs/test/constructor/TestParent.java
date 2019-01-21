package com.techlabs.test.constructor;

import com.techlabs.constructor.Child;
import com.techlabs.constructor.Parent;

public class TestParent {

	public static void main(String[] args) {
		Parent parent = new Child();
		System.out.println(parent.getFoo());
		
		Parent parent1 = new Child(100);
		System.out.println(parent1.getFoo());
	}

}
