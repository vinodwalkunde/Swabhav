package com.techlabs.employee.test;

import java.net.URL;
import java.util.Map;

import com.techlabs.employee.Analyzer;
import com.techlabs.employee.DiskLoader;
import com.techlabs.employee.Parser;
import com.techlabs.employee.URLLoader;

public class TestEmployeeData {

	public static void main(String[] args) throws Exception {
		String path = "https://swabhav-tech.firebaseapp.com/emp.txt ";
		URL url = new URL(path);
		URLLoader urlLoader = new URLLoader(url);
		String path1 = "dataFile.txt";
		DiskLoader diskLoader = new DiskLoader(path1);
		Parser dataParser = new Parser(diskLoader);
		dataParser.parse();
		Analyzer analyzer = new Analyzer(dataParser);
		Map<Integer, Integer> departmentwiseCount = analyzer.numberOfEmployeeByDepartment();
		System.out.println(departmentwiseCount);
		Map<String, Integer> designationwiseCount = analyzer.numberOfEmployeeByDesignation();
		System.out.println(designationwiseCount);
	}

}
