/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.conexaobd.servlet.venda;

import br.senac.sp.conexaobd.dao.ClienteDAO;
import br.senac.sp.conexaobd.entidade.Cliente;
import br.senac.sp.conexaobd.entidade.Produto;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Tiago Scarton
 */
public class RealizarVendaServlet extends HttpServlet {

    
    // Carregar a tela de vendas
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Carregar os clientes
        List<Cliente> listaClientes = ClienteDAO.getClientes();
        request.setAttribute("listaClientes", listaClientes);
        //Carregar os produtos
        Produto produto1 = new Produto(1, "TV", 2000.0);
        Produto produto2 = new Produto(2, "Smartphone", 1500.0);
        Produto produto3 = new Produto(3, "Notebook", 4000.0);
        Produto produto4 = new Produto(4, "Smart Watch", 500.0);
        List<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);
        listaProdutos.add(produto4);
        request.setAttribute("listaProdutos", listaProdutos);
        //Direcionar para a tela de vendas
        request.getRequestDispatcher("/protegido/realizarVenda.jsp").forward(request, response);
        
        
    
    }

    // Finalizar a venda.
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        String dados = request.getParameter("dados");
        JSONObject jsonDados = new JSONObject(dados);
        
        String cliente = jsonDados.getString("cliente");
        System.out.println(cliente);
        JSONArray produtos = jsonDados.getJSONArray("produtos");
        for (int i = 0; i < produtos.length(); i++) {
            JSONObject produto = produtos.getJSONObject(i);
            System.out.println(produto);
        }
        
    }

   

}
