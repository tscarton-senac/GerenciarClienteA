
package br.senac.sp.conexaobd.servlet;

import br.senac.sp.conexaobd.dao.ClienteDAO;
import br.senac.sp.conexaobd.entidade.Cliente;
import br.senac.sp.conexaobd.utils.Redirect;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AlterarClienteServlet extends HttpServlet {

     // CARREGAR INFO DO CLIENTE
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer id = Integer.parseInt(request.getParameter("id"));
        
        Cliente cliente = ClienteDAO.getCliente(id);
        request.setAttribute("cliente", cliente);
        
        request.getRequestDispatcher("/clientes/cadastrar.jsp").forward(request, response);
        
        
        
        
   }

    // ATUALIZAR O BD COM AS NOVAS INFO.
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String cpf = request.getParameter("cpf");
        Integer id = Integer.parseInt(request.getParameter("id"));
        
        Cliente cliente = new Cliente(id, nome, email, cpf);
        boolean ok = ClienteDAO.atualizar(cliente);
        Redirect.sendRedirect(ok, response);
    }

    

}
