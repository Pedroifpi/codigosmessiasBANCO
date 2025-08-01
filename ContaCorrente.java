package br.edu.ifpi.Model;

public class ContaCorrente extends ContaBancaria {
    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    @Override
    public boolean sacar(double valor) {
        if(valor <= (getSaldo() + getLimite())) {
            if(getSaldo() >= valor) {
                setSaldo(getSaldo() - valor);
            } else {
                double restante = valor - getSaldo();
                setSaldo(0);
                setLimite(getLimite() - restante);
            }
            return true;
        }
        return false;
    }
}