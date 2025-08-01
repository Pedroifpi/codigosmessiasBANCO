import br.edu.ifpi.Model.*;

public class Programa {
    public static void main(String[] args) {
        // criando um objeto do tipo Pessoa Fisica
        PessoaFisica pf = new PessoaFisica();
        pf.setNome("João");
        pf.setCpf("123.456.789-00");
        
        // criando um objeto do tipo pessoa jurídica
        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("Indústrias Acme");
        pj.setCnpj("10.123.456/0001-98");

        // criando um objeto do tipo conta corrente
        ContaCorrente cc = new ContaCorrente();
        cc.setNumero("CC-123"); // Adicionado setNumero()
        cc.setTitular(pj.getNome()); // Alterado para String
        cc.setSaldo(1100);
        cc.setLimite(500);
        
        // criando um objeto do tipo conta poupança
        ContaPoupanca cp = new ContaPoupanca();
        cp.setNumero("CP-456"); // Adicionado setNumero()
        cp.setTitular(pf.getNome()); // Alterado para String
        cp.setSaldo(1500);
        cp.setRendimento(2.0);
        
        // imprimindo dados da conta corrente
        System.out.println("\n=== Conta Corrente ===");
        System.out.println("Nome do titular da conta: " + cc.getTitular());
        System.out.println("CNPJ do titular: " + pj.getCnpj());
        System.out.println("Número da conta: " + cc.getNumero());
        System.out.println("Saldo da conta: " + cc.getSaldo());
        System.out.println("Limite da conta: " + cc.getLimite());

        // imprimindo dados da conta poupança
        System.out.println("\n=== Conta Poupança ===");
        System.out.println("Nome do titular da conta: " + cp.getTitular());
        System.out.println("CPF do titular: " + pf.getCpf());
        System.out.println("Número da conta: " + cp.getNumero());
        System.out.println("Saldo da conta: " + cp.getSaldo());
        System.out.println("Rendimento da conta: " + cp.getRendimento() + "%");

        // Testando operações bancárias
        System.out.println("\n=== Operações Bancárias ===");
        System.out.println("Sacando R$ 200 da conta corrente...");
        if(cc.sacar(200)) {
            System.out.println("Saque realizado! Novo saldo: " + cc.getSaldo());
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
