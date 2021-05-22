
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <c:import url="../../header.jsp"/>
        <h1>Vendas</h1>
       
        <table class="table">
            <th>IdCliente</th>
            <th>idProduto</th>
            <th>Data Venda</th>
            <th>Qte</th>
            <th>Preco</th>
           
            <c:forEach items="${vendas}" var="venda">
                <tr>
                    <td>${venda.idCliente}</td>
                    <td>${venda.idProduto}</td>
                    <td><fmt:formatDate pattern="dd/MM/yyyy" value="${venda.dataVenda}" /></td>
                    <td>${venda.qte}</td>
                    <td>${venda.preco}</td>
                   
                   
                </tr>
            </c:forEach>
            
        </table>
        
       
        
        
        <c:import url="../../footer.jsp"/>
    </body>
</html>
