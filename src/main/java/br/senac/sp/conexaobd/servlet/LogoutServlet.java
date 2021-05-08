
package br.senac.sp.conexaobd.servlet;

import br.senac.sp.conexaobd.dao.UsuarioDAO;
import br.senac.sp.conexaobd.entidade.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet {

  
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       HttpSession sessao = request.getSession();
       sessao.invalidate();
       response.sendRedirect(request.getContextPath() + "/login.jsp");
       
        
    }


}
