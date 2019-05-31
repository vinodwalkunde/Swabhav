package com.techlabs.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.business.Contact;
import com.techlabs.service.ContactService;

public class AddContactAction extends ActionSupport{
	Contact contact = new Contact();
	ContactService service = new ContactService();
	private String post = "false";

	@Override
	public String execute() throws Exception {
		if (post.equals("true")) {
			return this.SUCCESS;
		}
		return this.INPUT;
	}

	public String executeDo() {
		System.out.println(contact.getName() + " " + contact.getEmail());
		service.addContact(contact);
		return this.SUCCESS;
	}
	public void validate() { 
		if (post.equals("true")) {
		System.out.println("Validate");
	    if(contact.getName()==null)  
	        addFieldError("contact.name","Name can't be blank");  
	    if(contact.getEmail()==null)  
	        addFieldError("contact.email","Email must be greater than 5");  
		}
	} 
	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

}
