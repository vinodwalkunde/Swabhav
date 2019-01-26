package com.techlabs.filereaderwriter.test;

import com.techlabs.filereaderwriter.ReadCSV;

public class TestStateCapital {

	public static void main(String[] args) throws Exception {
		ReadCSV csv = new ReadCSV();
		csv.reader();
		csv.genrateCsv();
	}

}
