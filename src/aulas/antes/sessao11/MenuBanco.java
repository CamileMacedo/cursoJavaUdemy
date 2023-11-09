package aulas.antes.sessao11;

import java.util.Scanner;


public class MenuBanco {
    int opcao;
    Scanner teclado2 = new Scanner(System.in);
    
    public void menuBanco(){
        do{
            System.out.println("Selecione uma opção: ");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Sair");
            opcao = teclado2.nextInt();
            
            switch (opcao){
                case 1:
                    //Deposito
                    break;
                case 2:
                    //Sacar
                    break;
                case 3:
                    //Consultar Saldo
                    break;
                case 4:
                    //sair
                    break;
                default:
                    System.out.println("Opção inválida!\n");
            }
        }while(opcao > 0);
        teclado2.close();
    }
}
