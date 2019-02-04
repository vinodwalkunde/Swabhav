package com.techlabs.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookmarksManger implements IBookMarks {
	/* (non-Javadoc)
	 * @see com.techlabs.service.IBookMarks#addBookmarks(java.lang.String, java.lang.String)
	 */
	@Override
	public void addBookmarks(String name, String url) throws IOException {
		FileWriter fw = new FileWriter("data//Bookmarks.html", true);
		fw.write("<a href=\"" + url + "\">" + name + "</a><br>\n");
		fw.close();
	}

	/* (non-Javadoc)
	 * @see com.techlabs.service.IBookMarks#viewBookmarks()
	 */
	@Override
	public List<String> viewBookmarks() throws FileNotFoundException {
		List<String>bookmarksList=new ArrayList<String>();
		File file = new File("data//Bookmarks.html");
		Scanner sc = new Scanner(file);
//		StringBuffer string = new StringBuffer();
		while (sc.hasNextLine()) {
			bookmarksList.add(sc.nextLine());
//			string.append(sc.nextLine());
//			string.append("\n");

		}
//		System.out.println(string);
		sc.close();
		return bookmarksList;
	}
}
