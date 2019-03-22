<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Action JSP</title>
</head>
<body>
    <%
    if(request.getParameter("name").equals("vinod")&&request.getParameter("password").equals("vinod")){
        out.print("Welcome "+request.getParameter("name"));
    }else{
        out.print("<p style='color:red'>Invalid UserName or Password</p><br><a href='login.html'>Login</a>");
    }
    %>
  
</body>
</html>