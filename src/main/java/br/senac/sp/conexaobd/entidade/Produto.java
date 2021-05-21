/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.conexaobd.entidade;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Produto {
    
    private Integer id;
    private String nome;
    private Double preco;
    
    public Produto(int id, String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
        this.id = id;
    }
    
    @Override
    public String toString() {
        return String.format("{'id': %d, 'nome': '%s', 'preco': %f }", id, nome, preco);
    }
    
}
