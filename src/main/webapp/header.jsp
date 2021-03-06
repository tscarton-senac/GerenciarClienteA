
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="${pageContext.request.contextPath}/lib/jquery-3.6.0.min.js" type="text/javascript"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    </head>
    <body>
        <h1>Bem vindo ao super cadastro de clientes</h1>
        <c:if test="${not empty sessionScope.usuario}">
            <p>Usuário Logado: ${sessionScope.usuario.nome} - Perfil: ${sessionScope.usuario.perfil} - Filial: ${sessionScope.usuario.filial}</p>
            <a href="<c:url value="/LogoutServlet"/>">Sair</a>
        </c:if>
        
    </body>
</html>
