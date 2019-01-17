package com.techlabs.test.person;

import com.techlabs.person.GenderOption;
import com.techlabs.person.Person;

public class TestPerson {

	public static void main(String[] args) {
		Person person = new Person("Prachit", 23, 50.5f, 44, GenderOption.MALE);
		person.eat();
		person.eat();

		person.workout();
		person.workout();

		System.out.println(person.categoryBMI());

		System.out.println("BMI Score: " + person.scoreBMI());
		printDetails(person);
		
	}

	public static void printDetails(Person person) {
		System.out.println("Name : " + person.getName() + " Age : " + person.getAge() + " Gender : "
				+ person.getGender() + " Weight : " + person.getWeight() + " Height : " + person.getHeight());
	}
}
