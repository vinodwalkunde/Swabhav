package com.techlabs.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.business.Transaction;
import com.techlabs.repository.AccountRespository;
import com.techlabs.service.AccountService;

public class AccountStatementController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AccountStatementController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);

		if (session != null) {
			String name = (String) session.getAttribute("user");

			AccountRespository respository = new AccountRespository();
			AccountService service = new AccountService(respository);

			List<Transaction> transactions = service.accountStatement(name);
			
			request.setAttribute("transactionsList", transactions);
			request.getRequestDispatcher("/passbook.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("/login.html").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
