<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.techlabs.controllers.Student"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View</title>
</head>
<body>
	<h1>Student Information</h1>
	<a href="http://localhost:8080/student-mvc-app/">Home</a>
	<br>
	<br>
	<a href="http://localhost:8080/student-mvc-app/login">Login</a>
	<br>
	<a href="http://localhost:8080/student-mvc-app/logout">LogOut</a>
	<br>
	<a href="http://localhost:8080/student-mvc-app/add">Add</a>
	<br>
	
	<%
		ArrayList<Student> Result = (ArrayList<Student>)request.getAttribute("Student");
		for(Student student:Result){
			out.print("<br>"+student+" <a href='http://localhost:8080/student-mvc-app/edit?rollnumber="+student.getRollNumber()+"'>Edit <a>");
			out.print(" <a href='http://localhost:8080/student-mvc-app/delete?rollnumber="+student.getRollNumber()+"'>Delete <a>");
		}
	%>
	<br>

</body>
</html>