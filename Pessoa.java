package br.edu.ifpi.Model;

public abstract class Pessoa {
    private String nome;   

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
}