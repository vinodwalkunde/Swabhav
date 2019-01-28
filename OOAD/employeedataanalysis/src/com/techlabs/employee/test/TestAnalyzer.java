package com.techlabs.employee.test;

import java.net.URL;
import com.techlabs.employee.Analyzer;
import com.techlabs.employee.Employee;
import com.techlabs.employee.Parser;
import com.techlabs.employee.URLLoader;

public class TestAnalyzer {

	public static void main(String[] args) throws Exception {
		String path = "https://swabhav-tech.firebaseapp.com/emp.txt ";
		URL url = new URL(path);
		URLLoader urlLoader = new URLLoader(url);
		Parser dataParser = new Parser(urlLoader);
		dataParser.parse();
		Analyzer analyzer = new Analyzer(dataParser);
		Employee employee = analyzer.MaxSalary();
		System.out.println(employee);
		System.out.println(analyzer.TotalNumberEmployee());
	}

}
