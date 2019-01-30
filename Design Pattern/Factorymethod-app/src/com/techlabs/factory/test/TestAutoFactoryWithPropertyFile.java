package com.techlabs.factory.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

import com.techlabs.factory.IAutoFactory;
import com.techlabs.factory.IAutomobile;

public class TestAutoFactoryWithPropertyFile {
	public static void main(String[] args) throws Exception {
		Properties properties = new Properties();
		InputStream input = null;
		try {
			input = new FileInputStream("config.properties");
			properties.load(input);

			String autoFactory = properties.getProperty("current.factory");
			Class cls = Class.forName(autoFactory);
			Method methodcall2 = cls.getDeclaredMethod("getInstance");
			IAutoFactory autoFactory2 = (IAutoFactory) methodcall2.invoke(null, null);

			IAutomobile car = autoFactory2.make();
			car.start();
			car.stop();
 
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
