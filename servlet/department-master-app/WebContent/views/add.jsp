<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="add" method="POST">
		Dept No : <input type="text" name="deptno" value="${requestScope.deptno}"
			> <br> DEPT NAME : <input type="text"
			name="dname" value="${requestScope.dname}">
		<br> LOCATION : <input type="text" name="loc"
			value="${requestScope.loc}">
		<br> <input type="submit" value="Add Department"> <br>
	</form>
	<br><br>
	<a href="http://localhost:8080/department-master-app/home">Back To Home</a>
	
</body>
</html>