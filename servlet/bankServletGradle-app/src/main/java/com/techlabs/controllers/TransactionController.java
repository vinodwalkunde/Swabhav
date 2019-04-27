package com.techlabs.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.business.Account;
import com.techlabs.repository.AccountRespository;
import com.techlabs.service.AccountService;

public class TransactionController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TransactionController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/transaction.html").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if (session != null) {
			String name = (String) session.getAttribute("user");
			int amount = Integer.parseInt(request.getParameter("amount"));
			String payment = request.getParameter("payment");
			System.out.println(name + " " + amount + " " + payment);

			AccountRespository respository = new AccountRespository();
			AccountService service = new AccountService(respository);
			Account account = service.getUser(name);

			if (payment.equalsIgnoreCase("deposit")) {
				service.deposit(account, amount);
			} else {
				service.withdraw(account, amount);
			}

		} else {
			request.getRequestDispatcher("/login.html").forward(request, response);
		}
	}

}
