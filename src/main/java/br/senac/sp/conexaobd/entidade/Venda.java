/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.conexaobd.entidade;

import java.sql.Date;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Tiago Scarton
 */
@Getter
@Setter
public class Venda {

    private int idCliente;
    private int idProduto;
    private Date dataVenda;
    private int qte;
    private float preco;
}
