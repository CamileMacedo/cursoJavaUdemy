package aulas.sessao11;

import java.util.Scanner;

public class Cliente {
    String nome, endereco;
    Scanner teclado = new Scanner(System.in);

    public Cliente(String nome, String enderenco){
            this.nome = nome;
            this.endereco = enderenco;
            this.ConfirmacaoCliente();
    }

    private void ConfirmacaoCliente(){
        System.out.println("Cliente " + nome + " Cadastrado!\n");
    }

    float ValorSaque(float saldo){
        System.out.println("Olá " + this.nome + "!\nSaldo disponível: " + saldo + "\nQual valor deseja sacar?");
        float valorSaque = Integer.parseInt(teclado.nextLine());
        return valorSaque;
    }

    float ValorDeposito(float saldo){
        System.out.println("Olá " + this.nome + "!\nSaldo disponível: " + saldo + "\nQual valor deseja depositar?");
        float ValorDeposito= Integer.parseInt(teclado.nextLine());
        return ValorDeposito;
    }
}