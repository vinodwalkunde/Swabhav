package com.techlabs.service;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.businesslogic.Bookmarks;

public class DataManger implements IBookMarks {
	public static List<Bookmarks> bookmarksList = new ArrayList<Bookmarks>();

	@Override
	public void addBookmarks(String name, String url) throws IOException {
		Bookmarks bookmarks = new Bookmarks(name, url);
		bookmarksList.add(bookmarks);

		FileWriter fw = new FileWriter("data//data.txt", true);
		fw.write(name + "," + url);
		fw.close();
	}

	@Override
	public void viewBookmarks() throws FileNotFoundException {
		
	}

}
