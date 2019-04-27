package com.techlabs.controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.model.Department;
import com.techlabs.repository.DepartmentRepository;
import com.techlabs.service.DepartmentService;

@WebServlet("/home")
public class DepartmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DepartmentServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		DepartmentRepository deptRepository;
		List<Department> deptList;
		try {
			deptRepository = new DepartmentRepository();
		
		DepartmentService departmentService=new DepartmentService(deptRepository);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/home.jsp");
		deptList=departmentService.getDepartment();
		System.out.println(deptList.size());
		
		requestDispatcher.forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
