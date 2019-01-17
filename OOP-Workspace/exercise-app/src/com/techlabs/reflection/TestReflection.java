package com.techlabs.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class TestReflection {

	public static void main(String[] args) {

		Method[] methods = String.class.getMethods();
		Constructor[] constructors = String.class.getConstructors();

		ReflectionMethod reflection = new ReflectionMethod();
		
		reflection.printNameOfMethods(methods);
		reflection.printCountOfMethods(methods);
		
		reflection.printNameOfConstructor(constructors);
		reflection.printCountOfConstructor(constructors);
		
		reflection.printCountOfGetter(methods);
		reflection.printCountOfSetter(methods);
		

	}

}
