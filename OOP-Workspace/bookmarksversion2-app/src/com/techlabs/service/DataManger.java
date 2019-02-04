package com.techlabs.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techlabs.businesslogic.Bookmarks;

public class DataManger implements IBookMarks {
	public static List<String> bookmarksList = new ArrayList<String>();

	@Override
	public void addBookmarks(String name, String url) throws IOException {
		Bookmarks bookmarks = new Bookmarks(name, url);
	

		FileWriter fw = new FileWriter("data//data.txt", true);
		fw.write(name + "," + url + "\n");
		fw.close();
	}

	@Override
	public List<String> viewBookmarks() throws FileNotFoundException {
		File file = new File("data//data.txt");
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {
			bookmarksList.add(sc.nextLine());
		}
		return bookmarksList;
	}

}
