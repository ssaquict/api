<%-- 
    Document   : index
    Created on : Oct 17, 2022, 8:54:53 PM
    Author     : SistemasU
--%>
<%@page import = "apis.api_cliente" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            api_cliente api_c = new api_cliente();
            System.out.println(api_c.get());
        %>
    </body>
</html> 
