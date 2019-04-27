package com.techlabs.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.model.Department;
import com.techlabs.repository.DepartmentRepository;
import com.techlabs.service.DepartmentService;

@WebServlet("/add")
public class AddDeptServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddDeptServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/add.jsp");
		requestDispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String deptno = request.getParameter("deptno");
			String dname = request.getParameter("dname");
			String loc = request.getParameter("loc");
			System.out.println(deptno + "..." + dname + "..." + loc);

			if (!deptno.equals("") && !dname.equals("") && !loc.equals("")) {
				DepartmentRepository deptRepository;

				deptRepository = new DepartmentRepository();

				DepartmentService deptService = new DepartmentService(deptRepository);
				deptService.add(new Department(deptno, dname, loc));
				response.sendRedirect("add");
			} else {
				request.setAttribute("deptno", deptno);
				request.setAttribute("dname", dname);
				request.setAttribute("loc", loc);
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/add.jsp");
				requestDispatcher.forward(request, response);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}