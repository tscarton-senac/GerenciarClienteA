
package br.senac.sp.conexaobd.entidade;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Usuario {
    
    private final String PERFIL_GERENTE = "GERENTE";
    
    private String nome;
    private String login;
    private String senha;
    private String perfil;
    private String filial;
    
    public boolean isGerente() {
        return perfil.equalsIgnoreCase(PERFIL_GERENTE);
    }
    
}
