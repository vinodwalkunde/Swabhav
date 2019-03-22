package com.techlabs.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Summery")
public class SummeryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public SummeryServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		Integer Count = (Integer)session.getAttribute("Count");
		PrintWriter printWriter = response.getWriter();
		printWriter.println("Session Object");
		printWriter.println("Session Id:"+request.getSession().getId());
		printWriter.println("Current Count:"+Count);
		
		ServletContext application=getServletContext();
		Integer ACount = (Integer)application.getAttribute("Count");
		printWriter.println("Application Object");
		printWriter.println("Current Count:"+ACount);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
