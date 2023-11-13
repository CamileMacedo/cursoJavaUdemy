package aulas.antes.sessao11;

import java.util.Scanner;

public class Cliente {
    String nome, endereco;
    Scanner teclado = new Scanner(System.in);

    public Cliente(String nome, String enderenco){
            this.nome = nome;
            this.endereco = enderenco;
            this.confirmacaoCliente();
    }

    private void confirmacaoCliente(){
        System.out.println("Cliente " + nome + " Cadastrado!\n");
    }

    public float valorSaque(float saldo){
        System.out.println("Olá " + this.nome + "!\nSaldo disponível: " + saldo + "\nQual valor deseja sacar?");
        float valorSaque = Integer.parseInt(teclado.nextLine());
        return valorSaque;
    }

    public float valorDeposito(float saldo){
        System.out.println("Olá " + this.nome + "!\nSaldo disponível: " + saldo + "\nQual valor deseja depositar?");
        float ValorDeposito= Integer.parseInt(teclado.nextLine());
        return ValorDeposito;
    }

    public String getNome(){
        return this.nome;
    }
}