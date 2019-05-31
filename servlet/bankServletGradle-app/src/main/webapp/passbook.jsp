
<%@page import="java.util.*"%>
<%@page import="com.techlabs.business.Transaction"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Passbook</h1>
	<%
		List<Transaction> transactionsList = (ArrayList) request.getAttribute("transactionsList");
		out.println("<table border=1><tr><th>Name</th><th>PaymentType</th><th>Amount</th><th>Date</th></tr><br>");
		for (Transaction transaction : transactionsList) {
			out.print("<tr><td>" + transaction.getName() + "</td><td>" + transaction.getPaymentType() + "</td><td>"
					+ transaction.getAmount() + "</td><td>" + transaction.getDate() + "</td><tr>");
		}
		out.println("<table>");
	%>
	<br />
    <input type="button" id="btnExport" value="Export" onclick="Export()" />
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
    <script src="table2excel.js" type="text/javascript"></script>
    <script type="text/javascript">
        function Export() {
            $("#tblCustomers").table2excel({
                filename: "Table.xls"
            });
        }
    </script>
</body>

</html>