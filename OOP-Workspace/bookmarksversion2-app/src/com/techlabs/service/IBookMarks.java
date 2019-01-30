package com.techlabs.service;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface IBookMarks {

	void addBookmarks(String name, String url) throws IOException;

	void viewBookmarks() throws FileNotFoundException;

}