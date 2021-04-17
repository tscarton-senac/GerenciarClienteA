<%-- 
    Document   : index
    Created on : Apr 9, 2021, 7:54:18 PM
    Author     : t735915
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body class="container">
        <c:import url="header.jsp"/>
        <h1>Menu</h1>
        <br/>
        <a href="ClienteServlet">Listar Clientes</a>
        <br/>
        <a href="clientes/cadastrar.jsp">Cadastrar Cliente</a>
        
        <br/><br/>
        <c:import url="footer.jsp"/>
        
        
    </body>
</html>
