package com.techlabs.test.circle;

import com.techlabs.circle.Circle;

public class TestCircle {

	public static void main(String[] args) {
		Circle smallCircle = new Circle();
		smallCircle.setRadius(1.5f);
		printCircle(smallCircle);

		Circle bigCircle = new Circle();
		bigCircle.setRadius(5.5f);
		printCircle(bigCircle);

		Circle temp = bigCircle;
		temp.setRadius(2.0f);
		System.out.println(temp.getRadius());
		System.out.println(bigCircle.getRadius());
		temp = null;
		System.out.println(bigCircle.getRadius());
		// System.out.println(temp.getRadius());

		Circle[] myCircle = new Circle[3];
		Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		Circle circle3 = new Circle();
		circle1.setRadius(1.5f);
		circle2.setRadius(2.5f);
		circle3.setRadius(3.5f);

		myCircle[0] = circle1;
		myCircle[1] = circle2;
		myCircle[2] = circle3;

		Circle big = findBiggestCircleOnRadius(myCircle);
		System.out.println("Biggest Object");
		printCircle(big);
		printCircle(myCircle);
	}

	private static void printCircle(Circle circle) {
		//System.out.println(circle.hashCode());
		System.out.println("Radius= " + circle.getRadius() + " Area =" + circle.calculateArea() + " Circumference = "
				+ circle.calculaterCircumference());

	}
	
	private static void printCircle(Circle[] circle) {
		for(Circle circles:circle) {
			printCircle(circles);
		}
	}

	private static Circle findBiggestCircleOnRadius(Circle[] arrayCircle) {
		int temp = 0;
		for (int i = 0; i < arrayCircle.length; i++) {
			// biggestRadius=Math.max(arrayCircle[i].getRadius(),
			// arrayCircle[i+1].getRadius());
			if (arrayCircle[temp].getRadius() < arrayCircle[i].getRadius()) {
				temp = i;
			}
		}
		return arrayCircle[temp];

	}

}
