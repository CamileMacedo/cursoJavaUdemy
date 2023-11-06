package aulas;

import java.util.Scanner;

public class AulasFuncoes {
    public static void main(String[] args) {
        int qtde;
        String frutas[];
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe a quantas frutas deseja cadastrar: ");
        qtde = Integer.parseInt(teclado.nextLine());

        //definindo o tamanho
        frutas = new String[qtde];

        for(int i = 0; i < qtde; i++){
            System.out.println("Informe o nome da Fruta: ");
            frutas[i] = teclado.nextLine();
        }

        System.out.println("\n");

        for(int j=0 ; j<qtde; j++){
            System.out.println(frutas[j]);
        }
        
        teclado.close();
    }
    
}