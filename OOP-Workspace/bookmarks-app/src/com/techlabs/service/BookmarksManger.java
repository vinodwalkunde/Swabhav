package com.techlabs.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BookmarksManger {
	public static void addBookmarks(String name, String url) throws IOException {
		FileWriter fw = new FileWriter("data//Bookmarks.html", true);
		fw.write("<a href=\"" + url + "\">" + name + "</a><br>\n");
		fw.close();
	}

	public static void viewBookmarks() throws FileNotFoundException {
		File file = new File("data//Bookmarks.html");
		Scanner sc = new Scanner(file);
		StringBuffer string = new StringBuffer();
		while (sc.hasNextLine()) {
			string.append(sc.nextLine());
			string.append("\n");

		}
		System.out.println(string);
		sc.close();
	}
}
