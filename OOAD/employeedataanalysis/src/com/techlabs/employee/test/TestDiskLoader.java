package com.techlabs.employee.test;

import com.techlabs.employee.DiskLoader;
import com.techlabs.employee.Parser;

public class TestDiskLoader {

	public static void main(String[] args) throws Exception {
		String path = "dataFile.txt";
		DiskLoader diskLoader = new DiskLoader(path);
		diskLoader.load();
		Parser dataParser = new Parser(diskLoader);
		dataParser.parse();
		System.out.println(dataParser.getEmpDataSet());
	}

}
