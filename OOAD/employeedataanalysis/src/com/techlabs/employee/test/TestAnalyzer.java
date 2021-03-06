package com.techlabs.employee.test;

import java.net.URL;

import com.techlabs.employee.Analyzer;
import com.techlabs.employee.DiskLoader;
import com.techlabs.employee.Parser;
import com.techlabs.employee.URLLoader;

public class TestAnalyzer {

	public static void main(String[] args) throws Exception {
		String path = "https://swabhav-tech.firebaseapp.com/emp.txt ";
		URL url = new URL(path);
		URLLoader urlLoader = new URLLoader(url);

		String path1 = "dataFile.txt";
		DiskLoader diskLoader = new DiskLoader(path1);
		Parser dataParser = new Parser(diskLoader);
		dataParser.parse();

		Analyzer analyzer = new Analyzer(dataParser);
		System.out.println("Number of employee:" + analyzer.TotalNumberEmployee());
		System.out.println(analyzer.MaxSalary());

	}

}
