<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Query String</title>
</head>
<body>
    <%
    for(int i=1;i<7;i++){ 
        out.println("<h"+i+"> Welcome to JSP,Mr. "+request.getParameter("name")+"</h"+i+">");
    } 
   %>
</body>
</html>