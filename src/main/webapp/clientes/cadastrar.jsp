

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar Cliente</title>
    </head>
    <body>
        <c:import url="../header.jsp"/>
        <form action="CadastrarClienteServlet" method="POST">
            <label>Nome</label><br/>
            <input type="text" name="nome" required="true"/> <br/><br/>
            <label>Email</label><br/>
            <input type="text" name="email" required="true"/><br/><br/>
            <label>CPF</label><br/>
            <input type="text" name="cpf" required="true"/><br/><br/>
            
            <button type="submit">Cadastrar</button>
            
            
        </form>
        
        
        
        <c:import url="../footer.jsp"/>
    </body>
</html>
