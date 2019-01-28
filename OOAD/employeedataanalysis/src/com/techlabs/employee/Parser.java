package com.techlabs.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Parser {
	private Iloader iloader;
	private Set<Employee> empDataSet = new TreeSet<Employee>();

	public Parser(Iloader iloader) {
		this.iloader = iloader;
	}

	public void parse() throws Exception {
		String split = ",";
		List<String> data = new ArrayList<String>();
		data = iloader.load();
		for (String line : data) {
			String string = line;
			String[] linedata = string.split(split);

			int id = Integer.parseInt(linedata[0]);
			String name = linedata[1];
			String designation = linedata[2];
			String mangerId = linedata[3];
			String dateOfJoining = linedata[4];
			long salary = Integer.parseInt(linedata[5]);
			String commission = linedata[6];
			int department = Integer.parseInt(linedata[7]);

			Employee employee = new Employee(id, name, designation, mangerId, dateOfJoining, salary, commission,
					department);

			empDataSet.add(employee);
		}
	}

	public Iloader getIloader() {
		return iloader;
	}

	public void setIloader(Iloader iloader) {
		this.iloader = iloader;
	}

	public Set<Employee> getEmpDataSet() {
		return empDataSet;
	}

	public void setEmpDataSet(Set<Employee> empDataSet) {
		this.empDataSet = empDataSet;
	}
}
