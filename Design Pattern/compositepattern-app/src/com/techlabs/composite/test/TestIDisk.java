package com.techlabs.composite.test;

import com.techlabs.composite.File;
import com.techlabs.composite.Folder;

public class TestIDisk {

	public static void main(String[] args) {
		Folder movie = new Folder("Movie");
		File file = new File("abc", ".avi", 1980);
		movie.addItems(file);

		Folder hindiMovie = new Folder("HindiMovie");
		File rmn = new File("rmn", ".avi", 100);
		hindiMovie.addItems(rmn);

		Folder comdey = new Folder("Comdey");
		File xyz = new File("xyz", ".avi", 100);
		comdey.addItems(xyz);

		hindiMovie.addItems(comdey);

		Folder english = new Folder("English Movies");
		File mnr = new File("mnr", ".avi", 200);
		english.addItems(mnr);

		Folder tvseries = new Folder("TV Series");
		File st = new File("Stranger", ".avi", 500);
		tvseries.addItems(st);

		movie.addItems(hindiMovie);
		movie.addItems(english);
		movie.addItems(tvseries);

		movie.display();
	}

}
