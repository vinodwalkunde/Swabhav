<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>cookies2</title>
</head>

<body>
    <%
        Cookie color=new Cookie("color","red");
        color.setMaxAge(60);
        response.addCookie( color );
        
        out.println("<h2 style='color:"+color.getValue()+"'> Found Cookies Name and Value</h2>");
        out.print("Color = "+color.getValue());
    %>
</body>

</html>