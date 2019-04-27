package com.techlabs.action;

import com.opensymphony.xwork2.Action;

public class HomeAction implements Action {
	private String message;

	@Override
	public String execute() throws Exception {
		this.message ="Hello from Controller";
		return this.SUCCESS;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
