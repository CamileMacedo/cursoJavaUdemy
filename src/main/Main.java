package main;

import aulas.FuncoesFrutas;

public class Main {

    public static void main(String[] args) {
        
        FuncoesFrutas frutas = new FuncoesFrutas();
        FuncoesFrutas frutas2 = new FuncoesFrutas();

        frutas.cadastrarDados(frutas.sizeFrutas());
        frutas2.cadastrarDados(frutas2.sizeFrutas());

        System.out.println(frutas.finish());
        System.out.println(frutas2.finish());
    }
}
