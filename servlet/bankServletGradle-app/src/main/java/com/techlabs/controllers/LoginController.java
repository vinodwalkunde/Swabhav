package com.techlabs.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.business.Account;
import com.techlabs.repository.AccountRespository;

public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/login.html").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("name");
		String password = request.getParameter("password");

		try {
			AccountRespository respository = new AccountRespository();
			Account account=respository.getLoginDetail(username);
			System.out.println("Login Post");
			System.out.println(account.toString());
			if (account.getName().equals(username)&&account.getPassword().equals(password)) {
				HttpSession session = request.getSession(true);
				session.setAttribute("user", username);
				System.out.println("User Validate");
				request.getRequestDispatcher("/index.html").forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
