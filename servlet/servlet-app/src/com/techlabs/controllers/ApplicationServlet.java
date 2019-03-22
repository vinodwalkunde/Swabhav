package com.techlabs.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Application")
public class ApplicationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ApplicationServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext application = getServletContext();
		PrintWriter printWriter = response.getWriter();
		Integer Count;
		Integer old;
		Integer newValue;
		
		 if (application.getAttribute("Count")==null) {
			 Count=1;
			 old=0;
			 newValue=Count;
	         application.setAttribute("Count", Count);
	      } else {
	         Count = (Integer)application.getAttribute("Count");
	         old=Count;
	         Count = Count + 1;
	         newValue=Count;
	         application.setAttribute("Count",  Count);
	      }
		 printWriter.println("Old Count:"+old+"<br>");
		 printWriter.println("New Count:"+newValue);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
