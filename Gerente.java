package br.edu.ifpi.Model;

public class Gerente extends UsuarioAutenticavel {
    private String agencia;
    
    public String getAgencia() {
        return agencia;
    }
    
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
}