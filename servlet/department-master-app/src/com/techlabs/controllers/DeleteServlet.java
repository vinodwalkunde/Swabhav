package com.techlabs.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.repository.DepartmentRepository;
import com.techlabs.service.DepartmentService;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    	try {
    	String deptNo =request.getParameter("DeptNo");
		DepartmentRepository deptRepository;
		
			deptRepository = new DepartmentRepository();
		
		DepartmentService departmentService=new DepartmentService(deptRepository);
		departmentService.deleteDept(deptNo);
		response.sendRedirect("home");
		System.out.println("delete get method");
    	} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("delete post method");
	}

}