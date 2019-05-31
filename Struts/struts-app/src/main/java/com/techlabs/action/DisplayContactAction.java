package com.techlabs.action;

import java.util.List;

import com.opensymphony.xwork2.Action;
import com.techlabs.business.Contact;
import com.techlabs.service.ContactService;

public class DisplayContactAction implements Action {
	ContactService service = new ContactService();
	List<Contact> contactList;
	int length;

	@Override
	public String execute() throws Exception {
		contactList = service.getContactList();
		length = contactList.size();
		return this.SUCCESS;
	}

	public List<Contact> getContactList() {
		return contactList;
	}

	public void setContactList(List<Contact> contactList) {
		this.contactList = contactList;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

}
