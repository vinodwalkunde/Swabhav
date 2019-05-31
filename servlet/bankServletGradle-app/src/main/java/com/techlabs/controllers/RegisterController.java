package com.techlabs.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.business.Account;
import com.techlabs.repository.AccountRespository;
import com.techlabs.service.AccountService;

public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("RegisterController doGet");
		RequestDispatcher dispatcher = request.getRequestDispatcher("register.html");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String name = request.getParameter("name");
			int balance = Integer.parseInt(request.getParameter("balance"));
			String password = request.getParameter("password");
			System.out.println(name + "..." + balance + "..." + password);

			if (!name.equals("") && !password.equals("")) {
				Account account = new Account(name, balance, password);
				AccountRespository accountRespository=new AccountRespository();
				AccountService service=new AccountService(accountRespository);
				service.registerUser(account);
				response.sendRedirect("login");
			} else {
				request.setAttribute("name", name);
				request.setAttribute("balance", balance);
				request.setAttribute("password", password);
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("register.html");
				requestDispatcher.forward(request, response);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
