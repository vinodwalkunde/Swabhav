<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.io.*,java.util.*"%>

<html>
<head>
<title>Page Redirection</title>
</head>

<body>
	<%
		// New location to be redirected
		String site = new String("http://localhost:8080/department-master-app/home");
		response.setStatus(response.SC_MOVED_TEMPORARILY);
		response.setHeader("Location", site);
	%>
</body>
</html>