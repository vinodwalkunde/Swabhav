package com.techlabs.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Session")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public SessionServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		PrintWriter printWriter = response.getWriter();
		Integer Count;
		Integer old;
		Integer newValue;
		
		 if (session.isNew()) {
			 Count=1;
			 old=0;
			 newValue=Count;
	         session.setAttribute("Count", Count);
	      } else {
	         Count = (Integer)session.getAttribute("Count");
	         old=Count;
	         Count = Count + 1;
	         newValue=Count;
	         session.setAttribute("Count",  Count);
	      }
		 printWriter.print("Session Id:"+request.getSession().getId()+"<br>");
		 printWriter.println("Old Count:"+old+"<br>");
		 printWriter.println("New Count:"+newValue);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
	}

}
