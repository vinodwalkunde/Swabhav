package com.techlabs.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Auth")
public class AuthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public AuthServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	System.out.println("Get Method Called");
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
		
		response.setContentType("text/html");  
	    PrintWriter printWriter = response.getWriter();  
	          
	    String name=request.getParameter("name");
	    String password=request.getParameter("password"); 
	    
	    if(name.equals(password)) {
	    	printWriter.println("Welcome,"+name);
	    }else {
	    	printWriter.println("Wrong UserName Or Password");
	    }
	}

}
