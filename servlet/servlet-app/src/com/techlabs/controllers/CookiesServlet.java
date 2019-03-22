package com.techlabs.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Cookies")
public class CookiesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public CookiesServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out = response.getWriter();
		Cookie cookie = null;
	    Cookie[] cookies = null;
	    cookies = request.getCookies();
	    if( cookies != null ) {
	        out.println("<h2> Found Cookies Name and Value</h2>");
	        for (int i = 0; i < cookies.length; i++) {
	            cookie = cookies[i];
	            out.print("Name : " + cookie.getName( ) + ",  ");
	            out.print("Value: " + cookie.getValue( )+" <br/>");
	         }
	    } else {
	        Cookie color=new Cookie("color","red");
	        color.setMaxAge(60);
	        response.addCookie( color );
	        out.print("Color = "+color.getValue());
	        out.println("<h2 style='color:"+color.getValue()+"'> Found Cookies Name and Value</h2>");
	    }		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);

	}

}
