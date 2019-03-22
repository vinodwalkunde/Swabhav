<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Query</title>
</head>

<body>
    <%
        if(request.getParameter("name")!=null ){
        for(int i=1;i<7;i++){ 
            out.println("<h"+i+"> Welcome to JSP,Welcome "+request.getParameter("name")+"</h"+i+">");
        } 
    }else{
        for(int i=1;i<7;i++){ 
            out.println("<h"+i+"> Welcome to JSP </h"+i+">");
        }
    }
       %>
</body>

</html>