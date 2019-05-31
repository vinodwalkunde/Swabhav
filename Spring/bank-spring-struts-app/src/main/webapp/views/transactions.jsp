<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transaction</title>
<link href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.0/css/mdb.min.css" rel="stylesheet">
<style type="text/css">
.errorMessage {
	color: red;
}
</style>
</head>
<body>
	
	<s:form action="transaction.do" method="post">
		<s:textfield key="Amount" name="transaction.amount"></s:textfield>
		<s:radio key="Type" name="transaction.type" list="{'Deposite','Withdraw'}" ></s:radio>
		<s:submit key="submit" value="Submit"></s:submit>
	</s:form>
</body>
</html>