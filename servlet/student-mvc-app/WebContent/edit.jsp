<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit</title>
</head>
<body>
<form action="edit" method="POST">
  First name:<br>
  <input type="text" name="firstname" value="${requestScope.firstname }">
  <br>
  Last name:<br>
  <input type="text" name="lastname" value="${requestScope.lastname }"
  >
  <br>
  Roll Number:<br>
  <input type="number" name="rollnumber" value="${requestScope.rollnumber }" readonly="readonly">
  <br><br>
  <input type="submit" value="Save">
</form>
</body>
</html>