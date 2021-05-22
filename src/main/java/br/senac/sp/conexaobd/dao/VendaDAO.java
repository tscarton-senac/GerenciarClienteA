/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.conexaobd.dao;

import br.senac.sp.conexaobd.conexao.Conexao;
import br.senac.sp.conexaobd.entidade.Cliente;
import br.senac.sp.conexaobd.entidade.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author scarton
 */
public class VendaDAO {
    
    public static boolean cadastrar(List<Venda> vendas) {
        boolean ok = true;
        for(Venda venda: vendas) {
            ok = cadastrar(venda);
            if (!ok) {
                return ok;
            }
        }
        return ok;
    }
    
    public static boolean cadastrar(Venda venda) {
        boolean ok = true;
        String query = "insert into venda (datavenda, idcliente, idproduto, qte, preco) values (?,?,?,?,?)";
        Connection con;
        try {
            con = Conexao.getConexao();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setDate(1, venda.getDataVenda());
            ps.setInt(2, venda.getIdCliente());
            ps.setInt(3, venda.getIdProduto());
            ps.setInt(4, venda.getQte());
            ps.setFloat(5, venda.getPreco());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            ok = false;
        }
        return ok;
    }
    
   public static List<Venda> getVendas() {
        List<Venda> vendas = new ArrayList<>();
        String query = "select * from venda";
        Connection con;
        try {
            con = Conexao.getConexao();
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Date dataVenda = rs.getDate("dataVenda");
                Integer idCliente = rs.getInt("idCliente");
                Integer idProduto = rs.getInt("idProduto");
                Integer qte = rs.getInt("qte");
                Float preco = rs.getFloat("preco");
                Venda venda = new Venda();
                venda.setDataVenda(dataVenda);
                venda.setIdCliente(idCliente);
                venda.setIdProduto(idProduto);
                venda.setPreco(preco);
                venda.setQte(qte);
                vendas.add(venda);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vendas;
    }
   
   
    
    
}
