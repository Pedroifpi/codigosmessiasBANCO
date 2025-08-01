import br.edu.ifpi.Model.*;

public class Principal {
    public static void main(String[] args) {
       
        ContaBancaria conta = new ContaBancaria();
        conta.setNumero("12345");
        conta.setTitular("João da Silva");
        conta.depositar(1000);

        System.out.println("Número da conta: " + conta.getNumero());
        System.out.println("Titular da conta: " + conta.getTitular());
        System.out.println("Saldo da conta: " + conta.getSaldo());
          

        if(conta.sacar(100)){
            System.out.println("Saque realizado com sucesso!");
        }else{
            System.out.println("Saldo insuficiente!");
        }

  System.out.println("O novo saldo é: " + conta.getSaldo());
        
}
}

