/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.conexaobd.servlet.produtos;

import br.senac.sp.conexaobd.entidade.Produto;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CarregarProdutos extends HttpServlet {

   
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String filial = request.getParameter("nomeFilial");
        
        // CARREGAR DO BD OS PRODUTOS DA FILIAL
        Produto produto1 = new Produto(1, "TV", 2000.00);
        Produto produto2 = new Produto(2, "iPhone", 10000.00);
        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        
        response.setStatus(200);
        response.getWriter().print(produtos);
        
        
    }

   

   

}
