<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"	
    %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result of Beer</title>
</head>
<body>
	<h1>Beer Information</h1>
	<%
	ArrayList Result = (ArrayList)request.getAttribute("Brands");
	Iterator iterator = Result.iterator();
	while(iterator.hasNext()){
		out.print("<br>Try : "+iterator.next());
	}
	%>
	<br><a href="http://localhost:8080/beer-app/views/form.html" >Enter Form Again</a>

</body>
</html>