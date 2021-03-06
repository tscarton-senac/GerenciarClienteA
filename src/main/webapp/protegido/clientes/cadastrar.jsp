

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar Cliente</title>
    </head>
    <body class="container">
        <c:import url="../../header.jsp"/>
        
        <c:if test="${empty cliente}">
            <form action="${pageContext.request.contextPath}/CadastrarClienteServlet" method="POST">
                <label class="form-label">Nome</label><br/>
                <input type="text" name="nome" required="true" class="form-control" required/> <br/><br/>
                <label class="form-label">Email</label><br/>
                <input type="text" name="email" required="true" class="form-control" required/><br/><br/>
                <label class="form-label">CPF</label><br/>
                <input type="text" name="cpf" required="true" class="form-control" required/><br/><br/>
                <label>Data de Nascimento</label><br/>
                <input type="date" name="data" required="true" class="form-control" required/><br/><br/>

                <button type="submit" class="btn btn-primary">Cadastrar</button>
            </form>
        </c:if>
        <c:if test="${not empty cliente}">
            <form action="AlterarClienteServlet" method="POST">
                 <input type="text" name="id" hidden="true" value="${cliente.id}"  class="form-control" required/> 
                <label>Nome</label><br/>
                <input type="text" name="nome" required="true" value="${cliente.nome}"  class="form-control" required/> <br/><br/>
                <label>Email</label><br/>
                <input type="text" name="email" required="true" value="${cliente.email}"  class="form-control" required/><br/><br/>
                <label>CPF</label><br/>
                <input type="text" name="cpf" required="true" value="${cliente.cpf}"  class="form-control" required/><br/><br/>
                
               
                <button type="submit">Atualizar</button>
            </form>
            
        </c:if>
        
        
        
        
        
        <c:import url="../../footer.jsp"/>
    </body>
</html>
