package com.techlabs.circle;

public class Circle {
	private float radius;
	private static final float PI = 3.14f;

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		if (radius < 0) {
			radius = 1;
		}
		this.radius = radius;
	}

	
	public float calculateArea() {
		return PI * radius * radius;

	}

	public float calculaterCircumference() {
		return 2 * PI * radius;

	}

}
