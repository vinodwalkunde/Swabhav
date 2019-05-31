<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Contact Page</title>
</head>
<body>
<s:form action = "add.do">
<s:hidden name="post" value="true" />
<s:textfield key = "Name" name = "contact.name" />
<s:textfield key = "Email" name = "contact.email" />
<s:submit key = "submit" value="submit"/>
</s:form>
</body>
</html>