package com.techlabs.employee;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private String designation;
	private String mangerId;
	private String dateOfJoining;
	private long salary;
	private String commission;
	private int department;

	public Employee(int id, String name, String designation, String mangerId, String dateOfJoining, long salary,
			String commission, int department) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.mangerId = mangerId;
		this.dateOfJoining = dateOfJoining;
		this.salary = salary;
		this.commission = commission;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	public String getMangerId() {
		return mangerId;
	}

	public void setMangerId(String mangerId) {
		this.mangerId = mangerId;
	}

	public String getCommission() {
		return commission;
	}

	public void setCommission(String commission) {
		this.commission = commission;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((commission == null) ? 0 : commission.hashCode());
		result = prime * result + ((dateOfJoining == null) ? 0 : dateOfJoining.hashCode());
		result = prime * result + department;
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + id;
		result = prime * result + ((mangerId == null) ? 0 : mangerId.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (salary ^ (salary >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (commission == null) {
			if (other.commission != null)
				return false;
		} else if (!commission.equals(other.commission))
			return false;
		if (dateOfJoining == null) {
			if (other.dateOfJoining != null)
				return false;
		} else if (!dateOfJoining.equals(other.dateOfJoining))
			return false;
		if (department != other.department)
			return false;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (id != other.id)
			return false;
		if (mangerId == null) {
			if (other.mangerId != null)
				return false;
		} else if (!mangerId.equals(other.mangerId))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + designation + " " + mangerId + " " + dateOfJoining + " " + salary + " "
				+ commission + " " + department;
	}

	@Override
	public int compareTo(Employee o) {
		return (int) (this.id - o.id);
	}
}
