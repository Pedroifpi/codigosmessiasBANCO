package br.edu.ifpi.Model;

public class Diretor extends UsuarioAutenticavel {
    private String departamento;
    
    public String getDepartamento() {
        return departamento;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}