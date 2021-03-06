package br.senac.sp.conexaobd.servlet;

import br.senac.sp.conexaobd.dao.UsuarioDAO;
import br.senac.sp.conexaobd.entidade.Usuario;
import br.senac.sp.conexaobd.utils.CryptoUtils;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String login = request.getParameter("login");
        String senhaAberta = request.getParameter("senha");
        
        Usuario usuario = UsuarioDAO.getUsuario(login);
        if (usuario == null) { // Usuario NOK
            response.sendRedirect(request.getContextPath() + "/login.jsp?loginInvalido=true");
        } else {
            boolean senhaOK = CryptoUtils.verificarSenha(senhaAberta, usuario.getSenha());
            if (senhaOK) { // Usuario OK
                HttpSession sessao = request.getSession();
                sessao.setAttribute("usuario", usuario);
                response.sendRedirect(request.getContextPath() + "/protegido/index.jsp");
            } else { // Senha NOK
                response.sendRedirect(request.getContextPath() + "/login.jsp?loginInvalido=true");
            }
        }

    }

}
