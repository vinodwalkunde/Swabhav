package com.techlabs.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.service.StudentService;

public class HomeAction extends ActionSupport {

	@Autowired
	StudentService service;
	int count;

	@Override
	public String execute() throws Exception {
		count = service.getAllStudent().size();
		System.out.println(count);
		return SUCCESS;
	}

	public StudentService getService() {
		return service;
	}

	public void setService(StudentService service) {
		this.service = service;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
