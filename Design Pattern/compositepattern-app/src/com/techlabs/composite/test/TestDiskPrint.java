package com.techlabs.composite.test;

import com.techlabs.composite.File;
import com.techlabs.composite.Folder;

public class TestDiskPrint {

	public static void main(String[] args) {
		Folder movie = new Folder("Movie");
		Folder hindiMovie = new Folder("HindiMovie");
		Folder english = new Folder("English Movies");
		
		movie.addItems(hindiMovie);
		movie.addItems(english);
		
		File rmn = new File("rmn", ".avi", 100);
		hindiMovie.addItems(rmn);
		Folder comdey = new Folder("Comdey");
		hindiMovie.addItems(comdey);
		movie.display();
	}

}
