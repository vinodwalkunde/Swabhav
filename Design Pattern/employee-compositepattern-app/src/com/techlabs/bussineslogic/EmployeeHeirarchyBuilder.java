package com.techlabs.bussineslogic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EmployeeHeirarchyBuilder {
	private Employee rootEmployee = null;
	private Map<Integer, Employee> empMap = new HashMap<Integer, Employee>();

	public EmployeeHeirarchyBuilder(Set<Employee> empSet) {
		for (Employee employee : empSet) {
			empMap.put(employee.getEmpId(), employee);
		}
		getHeirarchy();
	}

	public Employee getRoot() {
		for (Employee employee : empMap.values()) {
			if (employee.getMangerId() == null) {
				return rootEmployee = employee;
			}
		}
		return rootEmployee;
	}
	
	public void getHeirarchy() {
		for (Map.Entry<Integer, Employee> entry : empMap.entrySet()) {
			for(Map.Entry<Integer, Employee> repotee : empMap.entrySet()) {
				if(repotee.getValue().getMangerId()!=null) {
					if(entry.getKey().equals(repotee.getValue().getMangerId())) {
						entry.getValue().addRepotee(repotee.getValue());
					}
				}else {
					rootEmployee=repotee.getValue();
				}
			}
		}
	}
}
