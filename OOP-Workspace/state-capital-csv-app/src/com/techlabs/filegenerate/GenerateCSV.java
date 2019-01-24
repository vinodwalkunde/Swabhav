package com.techlabs.filegenerate;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class GenerateCSV {
	String csvFile = "StateCapital.csv";
	String csvSpiltBy = ", ";
	String csvNextLine = "\n";
	TreeMap<String, String> addMap = new TreeMap<String, String>();
	
	public void genrateCsv() throws IOException {
		FileWriter fileWriter = null;
		fileWriter = new FileWriter(csvFile, true);

		for (Map.Entry<String, String> entry : addMap.entrySet()) {
			fileWriter.append(String.valueOf(entry.getKey()));
			fileWriter.append(csvSpiltBy);
			fileWriter.append(String.valueOf(entry.getValue()));
			fileWriter.append(csvNextLine);
		}
		fileWriter.close();
	}

	public void addData(String state, String capital) {
		addMap.put(state.trim(), capital.trim());
	}
}
