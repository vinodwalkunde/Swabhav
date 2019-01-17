package com.techlabs.test.rectangle;

import com.techlabs.rectangle.Rectangle;

public class TestRectangle {

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle();

		rectangle.setHeight(10);
		System.out.println(rectangle.getHeight());

		rectangle.setWidth(110);
		System.out.println(rectangle.getWidth());
		
		System.out.println(new Rectangle().calcuateArea());

	}

}
