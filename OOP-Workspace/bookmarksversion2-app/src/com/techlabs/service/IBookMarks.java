package com.techlabs.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface IBookMarks {

	void addBookmarks(String name, String url) throws IOException;

	List<String> viewBookmarks() throws FileNotFoundException;

}