<%@page import="java.util.*"%>
<%@page import="com.techlabs.business.Transaction"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Passbook</title>
</head>
<body>
	<h1>Passbook</h1>
	<%
		List<Transaction> transactionList = (ArrayList) request.getAttribute("transactionList");
		out.print("<table border='2px'>");
		out.print("<tr><th>Name</th><th>Amount</th><th>Type</th><th>Date</th></tr>");
		for (Transaction transaction:transactionList) {
			out.print("<tr><td>" + transaction.getName() + "</td><td>" + transaction.getAmount() + "</td><td>"
					+ transaction.getType() + "</td><td>"+transaction.getDate()+"</td></tr>");
		}
		out.print("</table>");
	%>
</body>
</html>