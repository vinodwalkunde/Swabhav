package com.techlabs.test;

import java.io.FileWriter;
import java.util.Properties;

public class TestCreate {
	public static void main(String[] args) throws Exception {

		Properties p = new Properties();
		p.setProperty("name", "Vinod Walkunde");
		p.setProperty("email", "vinodwalkunde@gmail.com");

		p.store(new FileWriter("info.properties"), "Properties file Example");

	}
}
