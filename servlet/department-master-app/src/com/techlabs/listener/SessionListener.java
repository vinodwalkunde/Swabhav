package com.techlabs.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener implements HttpSessionListener {
	public SessionListener() {
	}

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("--- HttpSessionListener session Created invoked ---");
		HttpSession session = se.getSession();
		System.out.println("session id: " + session.getId());
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("--- HttpSessionListener session Destroyed invoked --");
	}

}