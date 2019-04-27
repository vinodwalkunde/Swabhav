package com.techlabs.service;

import java.sql.SQLException;
import java.util.List;

import com.techlabs.model.Department;
import com.techlabs.repository.DepartmentRepository;

public class DepartmentService {
	private DepartmentRepository deptRepository;
	
	public DepartmentService(DepartmentRepository deptRepository) {
		this.deptRepository=deptRepository;
		
	}
	
	public List<Department> getDepartment()throws SQLException{
		return deptRepository.getList();
	}
	
	public void add(Department department) throws SQLException{
		deptRepository.addToDept(department);
	}
	
	public void deleteDept(String deptNo) {
		deptRepository.deleteDept(deptNo);
	}
	
//	public void updateDept(String deptNo) {
//		deptRepository.updateDept(deptNo);
//	}
	public Department updateDept(String deptNo) {
		return deptRepository.getDeptNo(deptNo);
		
	}
}
