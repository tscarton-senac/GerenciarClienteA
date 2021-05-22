/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.conexaobd.servlet.relatorio;

import br.senac.sp.conexaobd.dao.VendaDAO;
import br.senac.sp.conexaobd.entidade.Venda;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tiago Scarton
 */
public class RelatorioServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Venda> vendas = VendaDAO.getVendas();
        request.setAttribute("vendas", vendas);
        request.getRequestDispatcher("/protegido/gerente/relatorio.jsp").forward(request, response);
    }



}
