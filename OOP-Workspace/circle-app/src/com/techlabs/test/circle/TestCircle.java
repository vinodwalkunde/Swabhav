package com.techlabs.test.circle;

import com.techlabs.circle.Circle;

public class TestCircle {

	public static void main(String[] args) {
		Circle circle=new Circle();
		circle.setRadius(-10f);
		System.out.println(circle.getRadius());
		
		System.out.println(circle.calculateArea());
		System.out.println(circle.calculaterParmeter());
	}

}
