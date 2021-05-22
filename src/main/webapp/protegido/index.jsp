

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body class="container">
        <c:import url="../header.jsp"/>
        <h1>Menu</h1>
        <br/>
        <a href="<c:url value="/ClienteServlet"/>">Listar Clientes</a>
        <br/>
        <a href="clientes/cadastrar.jsp">Cadastrar Cliente</a>
        <br/>
        <a href="<c:url value="/RealizarVendaServlet"/>">Realizar Venda</a>
        <br/>
        <c:if test="${sessionScope.usuario.isGerente()}">
             <a href="<c:url value="/RelatorioServlet"/>">Relatório do Gerente</a>
        </c:if>
       
        
        <br/><br/>
        <c:import url="../footer.jsp"/>
        
        
    </body>
</html>
