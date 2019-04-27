<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="edit" method="POST">  
Department Number    :<input type="text" name="deptNumber"  value="${requestScope.deptNumber}" readonly="readonly"><br/>  
Department Name      :<input type="text" name="deptName" value="${requestScope.deptName}"><br/>  
Department Location  :<input type="text" name="deptLocation" value="${requestScope.deptLocation}"><br/> 
  
<input type="submit" value="SAVE" />  
<a href="http://localhost:8080/department-master-app/home"><input type="button" value="CANCEL" />
</form>  
</body>
</html>