package com.techlabs.test.rectangle;

import com.techlabs.rectangle.Rectangle;

public class TestRectangle {

	public static void main(String[] args) {
		System.out.println(new Rectangle(10, 20).calcuateArea());

		Rectangle rectangle = new Rectangle(12, 5);
		System.out.println(rectangle.calcuateArea());
		
		printDetails(rectangle);
		printDetails(new Rectangle(10, 40,"white"));
		printDetails(new Rectangle(10, 20,"gReen"));
		printDetails(new Rectangle(10, 5, "foo"));
	}

	public static void printDetails(Rectangle rectangle) {
		System.out.println("Height :" + rectangle.getHeight() + " Width :" + rectangle.getWidth() + " Area :"
				+ rectangle.calcuateArea()+" bgColor :"+rectangle.getBgcolor());
	}

}
