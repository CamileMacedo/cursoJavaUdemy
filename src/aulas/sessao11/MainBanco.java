package aulas.sessao11;

public class MainBanco {
    
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Maria", "Rua Oliveira, nº40");
        Cliente cliente2 = new Cliente("João", "Rua Amor, nº30");

        Conta conta1 = new Conta(1, 100, 1000, cliente1);
        Conta conta2 = new Conta(2, 1000, 10000, cliente2);
        
        conta1.efetuarDeposito(cliente1.ValorDeposito(conta1.getSaldo()));
        conta2.efetuarSaque(cliente2.ValorSaque(conta2.getSaldo()));
    }
}
