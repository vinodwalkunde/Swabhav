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

/**
 * Servlet implementation class EditServlet
 */
@WebServlet("/edit")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public EditServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//int DeptNo = (Integer.parseInt(request.getParameter("DeptNo")));
			String DeptNo =request.getParameter("DeptNo");
			DepartmentRepository deptRepository;
			
				deptRepository = new DepartmentRepository();
			
			DepartmentService editDept = new DepartmentService(deptRepository);
			//String dp=Integer.toString(DeptNo);
//			editDept.updateDept(DeptNo);
			Department d=editDept.updateDept(DeptNo);

			request.setAttribute("deptNumber", d.getDeptno());
			request.setAttribute("deptName", d.getDname());
			request.setAttribute("deptLocation", d.getLocation());
			RequestDispatcher dispatcher = request.getRequestDispatcher("views/edit.jsp");
			dispatcher.forward(request, response);
		
			System.out.println("edit get method");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String firstName = request.getParameter("firstName");
//		String lastName = request.getParameter("lastName");
//		int rollNumber = (Integer.parseInt(request.getParameter("rollNumber")));
//		DepartmentService update= new DepartmentService();
//		update.updateDept(deptNo);
//		response.sendRedirect("students");
//	
		System.out.println("edit post method");
	}

}