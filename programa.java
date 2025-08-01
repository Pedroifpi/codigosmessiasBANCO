import br.edu.ifpi.Model.*;

public class Programa {
    public static void main(String[] args) {

    // criando um objeto do tipo Pessoa Fisica
    PessoaFisica pf = new PessoaFisica();
    pf.setNome("João");
    pf.setCpf("123.456.789-00");
    
    //criando um objeto do tipo pessoa jurídica
    PessoaJuridica pj = new PessoaJuridica();
    pj.setNome("Industrias Acme");
    pj.setCnpj("10.123.456/0001-98");

   


//criando um objeto do tipo conta corrente
 ContaCorrente cc = new ContaCorrente();
 
 cc.setTitular(pj);
 cc.setSaldo(1100);
 cc.setLimite(500);
 
 //criando um objeto do tipo conta poupanca
ContaPoupanca cp = new ContaPoupanca();
cp.setTitular(pf);
cp.setSaldo(1500);
cp.setRendimento(2.0);
 
//imprimindo dados da conta corrente
System.out.println("Nome do titular da conta:"+cc.getTitular().getNome());
System.out.println("CNPJ do titular: " + ((PessoaJuridica) cc.getTitular()).getCnpj());//fazendo o casting para pessoa juridica para acessar o cnpj
System.out.println("Número da conta é: "+cc.getNumero());
System.out.println("Saldo da conta: "+cc.getSaldo());
System.out.println("Limite da conta: "+cc.getLimite());

//imprimindo dados da conta poupança
System.out.println("Nome do titula da conta: "+cp.getTitular().getNome());
System.out.println("CPF do titular: " +((PessoaFisica) cp.getTitular()).getCpf()); //fazendo o casting para pessoa fisica para acessar o cpf
System.out.println("O saldo da conta poupança é: "+cp.getSaldo());
System.out.println("Rendimento da conta é: "+cp.getRendimento());
}



}
