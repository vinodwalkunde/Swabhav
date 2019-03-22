package com.techlabs.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/edit")
public class EditStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EditStudentController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(true);
		if (session.isNew()) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
		} else {
			int rollnumber = Integer.parseInt(request.getParameter("rollnumber"));

			StudentService studentService = new StudentService();
			Student student = studentService.getById(rollnumber);

			request.setAttribute("firstname", student.getName());
			request.setAttribute("lastname", student.getLastName());
			request.setAttribute("rollnumber", student.getRollNumber());

			RequestDispatcher dispatcher = request.getRequestDispatcher("edit.jsp");
			dispatcher.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getParameter("firstname") == "" || request.getParameter("lastname") == ""
				|| request.getParameter("rollnumber") == "") {
			request.setAttribute("firstname", request.getParameter("firstname"));
			request.setAttribute("lastname", request.getParameter("lastname"));
			request.setAttribute("rollnumber", request.getParameter("rollnumber"));

			RequestDispatcher dispatcher = request.getRequestDispatcher("edit.jsp");
			dispatcher.forward(request, response);
		} else {
			String firstname = request.getParameter("firstname");
			String lastname = request.getParameter("lastname");
			int rollnumber = Integer.parseInt(request.getParameter("rollnumber"));
			Student student = new Student(firstname, lastname, rollnumber);
			StudentService studentService = new StudentService();
			studentService.update(student);
			response.sendRedirect("student");
		}
	}

}
