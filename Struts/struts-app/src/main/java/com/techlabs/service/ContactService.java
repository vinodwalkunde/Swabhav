package com.techlabs.service;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.business.Contact;

public class ContactService {
	static List<Contact> contactList = new ArrayList<Contact>();

	public ContactService() {
//		Contact contact = new Contact("Vinod", "vinod@gmail.com");
//		Contact contact2 = new Contact("Kuntan", "kuntan@gmail.com");
//		contactList.add(contact);
//		contactList.add(contact2);
	}

	public void addContact(Contact contact) {
		contactList.add(contact);
	}

	public List<Contact> getContactList() {
		return contactList;
	}
}
