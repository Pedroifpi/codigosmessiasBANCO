package br.edu.ifpi.Model;

public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return this.cnpj;
    }
}