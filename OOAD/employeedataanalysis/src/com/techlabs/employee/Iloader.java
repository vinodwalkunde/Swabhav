package com.techlabs.employee;

import java.io.IOException;
import java.util.List;

public interface Iloader {
	public List<String> load() throws IOException, Exception;
}
