package com.techlabs.test;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import com.techlabs.filegenerate.GenerateCSV;

public class TestGenerateCSV {

	public static void main(String[] args) throws IOException {
		GenerateCSV csv=new GenerateCSV();
		
		csv.addData("Maharastra", "Mumbai");
		csv.addData(" Maharastra ", " Mumbai");
		csv.genrateCsv();
		
		
	}

}
