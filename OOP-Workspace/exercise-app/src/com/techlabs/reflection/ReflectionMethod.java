package com.techlabs.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionMethod {

	public void printNameOfMethods(Method[] methods)  {
		for (Method method : methods) {
			System.out.println("method = " + method.getName());
		}
	}

	public void printCountOfMethods(Method[] methods) {
		System.out.println("Number of Method = " + methods.length);
	}

	public void printNameOfConstructor(Constructor[] constructors) {
			System.out.println("Constructor = " + constructors[1].getName());

	}

	public void printCountOfConstructor(Constructor[] constructors) {
		System.out.println("Number of Constructor = " + constructors.length);
	}

	public void printCountOfGetter(Method[] methods) {
		int countGetter = counter(methods, "get");
		System.out.println("Number of Getter = " + countGetter);
	}

	public void printCountOfSetter(Method[] methods) {
		int countSetter = counter(methods, "set");
		System.out.println("Number of Setter = " + countSetter);

	}

	private int counter(Method[] methods, String string) {
		int count = 0;
		for (int i = 0; i < methods.length; i++) {

			if (methods[i].getName().startsWith(string)) {
				count++;
			}
		}
		return count;
	}
}
