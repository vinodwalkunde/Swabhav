package com.techlabs.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.repository.DepartmentRepository;
import com.techlabs.service.DepartmentService;

@WebServlet("/display")
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DisplayServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		DepartmentRepository deptRepository;
		try {
			deptRepository = new DepartmentRepository();
			DepartmentService deptService = new DepartmentService(deptRepository);
			request.setAttribute("deptDetails", deptService.getDepartment());
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/display.jsp");
			requestDispatcher.forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
