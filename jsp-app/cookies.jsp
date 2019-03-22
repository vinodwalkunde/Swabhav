<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Cookies</title>
</head>

<body>
    <%
    Cookie cookie = null;
    Cookie[] cookies = null;
    cookies = request.getCookies();
    if( cookies != null ) {
        out.println("<h2> Found Cookies Name and Value</h2>");
        for (int i = 0; i < cookies.length; i++) {
            cookie = cookies[i];
            out.print("Name : " + cookie.getName( ) + ",  ");
            out.print("Value: " + cookie.getValue( )+" <br/>");
         }
    } else {
        Cookie color=new Cookie("color","red");
        color.setMaxAge(60);
        response.addCookie( color );
        out.print("Color = "+color.getValue());
        out.println("<h2 style='color:"+color.getValue()+"'> Found Cookies Name and Value</h2>");
    }

    
    %>
    
</body>

</html>