package br.edu.ifpi.Model;

public class ContaPoupanca extends ContaBancaria {
    private double rendimento;
 
    public ContaPoupanca() {
    }
 
    public double getRendimento() {
       return this.rendimento;
    }
 
    public void setRendimento(double rendimento) {
       this.rendimento = rendimento;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            return true;
        } else {
            System.out.println("Saldo insuficiente");
            return false;
        }
    }
}