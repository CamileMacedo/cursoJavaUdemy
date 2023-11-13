package aulas.main;

import aulas.antes.sessao11.Cliente;
import aulas.antes.sessao11.Conta;

class Main {
    
    public static void main(String[] args) {

        Cliente clientePedro = new Cliente("João", "Rua Amor, nº30");
        Conta contaPedro = new Conta(100, 1000, clientePedro);
        
        Cliente clienteMaria= new Cliente("João", "Rua Amor, nº30");
        Conta contaMaria = new Conta(100, 1000, clientePedro);

        
        contaPedro.efetuarDeposito(clientePedro.valorDeposito(contaPedro.getSaldo()));
        contaMaria.efetuarSaque(clienteMaria.valorSaque(contaMaria.getSaldo()));
    }
}