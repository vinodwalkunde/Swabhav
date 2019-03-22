package com.techlabs.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Welcome")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public WelcomeServlet() {
        super();
        System.out.println("Welcome Servlet");
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("DoGet Method Execute");
		PrintWriter printWriter=response.getWriter();
		
	    if(request.getParameter("devloper")!=null ){
	        for(int i=1;i<7;i++){ 
	        	printWriter.println("<h"+i+"> Welcome to Servlet,Welcome "+request.getParameter("devloper")+"</h"+i+">");
	        } 
	    }else{
	        for(int i=1;i<7;i++){ 
	        	printWriter.println("<h"+i+"> Welcome to Servlet</h"+i+">");
	        }
	    }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
		System.out.println("DoPost Method Execute");
		
	}

}
