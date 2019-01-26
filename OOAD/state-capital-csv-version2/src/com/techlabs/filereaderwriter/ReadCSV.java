package com.techlabs.filereaderwriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ReadCSV {
	private static final String FILENAME = "StateCapital.csv";
	private static final String FILENAMENEW = "StateCapitalNew.csv";

	BufferedReader br = null;
	String line = "";
	static String cvsSplitBy = ",";
	static String csvNextLine = "\n";

	static Map<String, String> map = new TreeMap<String, String>();
	ArrayList<String> list = new ArrayList<String>();

	public static void reader() throws Exception {
		File file = new File(FILENAME);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		while ((st = br.readLine()) != null) {
			st = st.toLowerCase();
			String[] names = st.split(",");
			addDataInMap(names);
			// System.out.println(Arrays.toString(names));
		}
		System.out.println("\n");
		br.close();
	}

	public static void addDataInMap(String[] names) {
		for (int i = 0; i < names.length; i++) {
			map.put(names[0].trim(), names[1].trim());
		}

	}

	public static void genrateCsv() throws IOException {
		FileWriter fileWriter = null;
		fileWriter = new FileWriter(FILENAMENEW, true);

		for (Map.Entry<String, String> entry : map.entrySet()) {
			fileWriter.append(String.valueOf(entry.getKey()));
			fileWriter.append(cvsSplitBy);
			fileWriter.append(String.valueOf(entry.getValue()));
			fileWriter.append(csvNextLine);
		}
		fileWriter.close();
	}

}