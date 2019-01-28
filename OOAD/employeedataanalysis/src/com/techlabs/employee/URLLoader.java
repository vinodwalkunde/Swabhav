package com.techlabs.employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class URLLoader implements Iloader {
	private URL url;

	public URLLoader(URL url) {
		this.url = url;
	}

	@Override
	public List<String> load() throws IOException {
		URLConnection yc = url.openConnection();
		BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
		StringBuffer string = new StringBuffer();
		String inputLine;
		List<String> data = new ArrayList<String>();
		while ((inputLine = in.readLine()) != null) {
			data.add(inputLine);

		}
		in.close();
		// String data = new String(string);

		return data;
	}

}
