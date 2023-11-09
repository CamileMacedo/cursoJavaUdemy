package aulas.caixa;

import aulas.antes.sessao11.Cliente;
import aulas.antes.sessao11.Conta;

public class ProgramCaixa {
    public static void main(String[] args) {

        Caixa prateleira = new Caixa();
        
        Cliente cliente1 = new Cliente("Maria", "Rua Oliveira, nº40");
        Cliente cliente2 = new Cliente("João", "Rua Amor, nº30");

        Conta contaMaria = new Conta(100, 1000, cliente1);
        Conta contaJoao = new Conta(400, 10000, cliente2);

        prateleira.adicionar(contaMaria);
        prateleira.adicionar (contaJoao);

        Conta conta = ((Conta)prateleira.getConta(0));

        System.out.println(conta.getSaldo());

        System.out.println(((Cliente)prateleira.getConta(2)).getNome());
    }
}