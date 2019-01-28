package com.techlabs.employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class DiskLoader implements Iloader {
	private String path;

	public DiskLoader(String path) {
		this.path = path;
	}

	@Override
	public List<String> load() throws Exception {
		List<String> list = new ArrayList<String>();
		FileReader fileReader = new FileReader(path);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			list.add(line);
		}
		bufferedReader.close();
		return list;
	}

}
