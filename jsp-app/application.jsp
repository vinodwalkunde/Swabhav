<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Application</title>
</head>
<body>
        <%
        Integer counter;
        Integer old;
        Integer newvalue;
    
        if (application.getAttribute("counter") == null) {
            counter = new Integer(1);
            old=0;
            newvalue=counter;
            
        } else {
            counter = (Integer)application.getAttribute("counter");
            old=counter;
            counter = new Integer(counter.intValue() + 1);
            newvalue=counter; 
        }
        out.println("Old Value= "+old+"<br>");
        out.println("New Value= "+newvalue+"</br>");
        application.setAttribute("counter",counter);
        %>

        <a href="summery.jsp">Summery</a>
</body>
</html>