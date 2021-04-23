
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Clientes</title>
        
        <script type="text/javascript">
            function mostrarTelaConfirmacao(nome, cpf){
                console.log("nome ", nome);
                $("#nomeCliente").html(nome);
                $("#cpfCliente").val(cpf)
                
                var modalConfirmacao = $("#confirmarExclusao");
                modalConfirmacao.show();
            }
            
            function fecharTelaConfirmacao() {
                $("#confirmarExclusao").hide();
            }
            
            function deletarCliente() {
                var cpf = $("#cpfCliente").val();
                fecharTelaConfirmacao();
                  $.ajax( "ExcluirClienteServlet?cpf="  + cpf).done(function() {
                        //Sucesso
                        location.reload();
                      })
                      .fail(function() {
                        console.log( "error" );
                        $("#alerta").css("display", "block");
                        setTimeout(function (){
                            $("#alerta").css("display", "none");
                        }, 1000);
                      })
                      
            }
            
        </script>
    </head>
    <body class="container">
        <c:import url="header.jsp"/>
        <h1>Clientes:</h1>
        <div class="alert alert-danger" role="alert" id="alerta" style="display:none">
            Erro ao excluir cliente!
         </div>
        <table class="table">
            <th>Nome</th>
            <th>Email</th>
            <th>CPF</th>
            <th>DATA NASCIMENTO</th>
            
            <c:forEach items="${listaClientes}" var="cliente">
                <tr>
                    <td>${cliente.nome}</td>
                    <td>${cliente.email}</td>
                    <td>${cliente.cpf}</td>
                    <td><fmt:formatDate pattern="dd/MM/yyyy" value="${cliente.dataNascimento}" /></td>
                    <td><a href="AlterarClienteServlet?cpf=${cliente.cpf}">Alterar</a></td>
                    
                    <td><button type="button" class="btn btn-link" onclick="mostrarTelaConfirmacao(`${cliente.nome}`,`${cliente.cpf}`)">Excluir</button></td>
                </tr>
            </c:forEach>
            
        </table>
        
        
        <div class="modal" id="confirmarExclusao" >
            <div class="modal-dialog">
              <div class="modal-content">
                <div class="modal-header">
                  <h5 class="modal-title">Confirmar Exclusão</h5>
                 </div>
                <div class="modal-body">
                    <p>Confirmar a exclusão do cliente <label id="nomeCliente"></label>  ?</p>
                    <input type="hidden" id="cpfCliente" />
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" onclick="fecharTelaConfirmacao()">Cancelar</button>
                    <button type="button" class="btn btn-primary" onclick="deletarCliente()" >Confirmar</button>
                </div>
              </div>
            </div>
          </div>
        
        
        <c:import url="footer.jsp"/>
    </body>
</html>
