package com.techlabs.person;

public class Person {
	private String name;
	private int age;
	private float weight;
	private int height;
	private GenderOption gender;

	public Person(String name, int age, float weight, int height, GenderOption gender) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public float getWeight() {
		return weight;
	}

	public GenderOption getGender() {
		return gender;
	}

	public int getHeight() {
		return height;
	}

	public void eat() {
		weight = weight + ((2 * weight) / 100);

	}

	public void workout() {
		weight = weight - ((3 * weight) / 100);
	}

	public float scoreBMI() {

		return ((weight * 703) / (height * height));
	}

	public String categoryBMI() {
		if (this.getGender() == GenderOption.MALE && this.scoreBMI() < 18f) {
			return ("UnderWeight!");
		}
		if (this.getGender() == GenderOption.MALE && this.scoreBMI() >= 18 && this.scoreBMI() < 25f) {
			return ("Normal Weight!");
		}
		if (this.getGender() == GenderOption.MALE && this.scoreBMI() >= 25) {
			return ("Over Weight");
		}
		if (this.getGender() == GenderOption.FEMALE && this.scoreBMI() < 15f) {
			return ("Under Weight!");
		}
		if (this.getGender() == GenderOption.FEMALE && this.scoreBMI() >= 15 && this.scoreBMI() < 23f) {
			return ("Normal Weight");
		}
		if (this.getGender() == GenderOption.FEMALE && this.scoreBMI() >= 23) {
			return ("Over Weight");
		} else
			return ("Normal");

	}

}
