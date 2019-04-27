package com.techlabs.model;

public class Department {
	private String deptno;
	private String dname;
	private String location;
	
	public Department(String deptno,String dname,String location) {
		this.deptno=deptno;
		this.dname=dname;
		this.location=location;
	}
	
	public String getDeptno() {
		return deptno;
	}
	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

}
