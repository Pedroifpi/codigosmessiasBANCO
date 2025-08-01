import br.edu.ifpi.Model.*;

public class Principal {
    public static void main(String[] args) {
        // Criando uma pessoa física
        PessoaFisica cliente = new PessoaFisica();
        cliente.setNome("João da Silva");
        cliente.setCpf("123.456.789-00");
        
        // Criando conta bancária
        ContaBancaria conta = new ContaBancaria();
        conta.setNumero("12345");
        conta.setTitular(cliente.getNome()); // Alterado para String
        conta.depositar(1000);

        System.out.println("\n=== Dados da Conta ===");
        System.out.println("Número da conta: " + conta.getNumero());
        System.out.println("Titular da conta: " + conta.getTitular());
        System.out.println("Saldo da conta: " + conta.getSaldo());
        
        // Operação de saque
        System.out.println("\nTentando sacar R$ 100...");
        if(conta.sacar(100)) {
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }

        System.out.println("Novo saldo: " + conta.getSaldo());
        
        // Testando saque com valor maior que o saldo
        System.out.println("\nTentando sacar R$ 1000...");
        if(conta.sacar(1000)) {
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
