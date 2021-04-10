
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Clientes</title>
    </head>
    <body>
        <c:import url="header.jsp"/>
        <h1>Clientes:</h1>
        
        <table>
            <th>Nome</th>
            <th>Email</th>
            <th>CPF</th>
            
            <c:forEach items="${listaClientes}" var="cliente">
                <tr>
                    <td>${cliente.nome}</td>
                    <td>${cliente.email}</td>
                    <td>${cliente.cpf}</td>
                </tr>
            </c:forEach>
            
        </table>
        <c:import url="footer.jsp"/>
    </body>
</html>
