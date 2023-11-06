package aulas;


/* Uma função deve ter:
* - Tipo de retorno
* - Nome
* - Parâmetros/argumentos de entrada
* - 
*/

import java.util.Scanner;

//Não fechar o teclado quando declara o Scanner no public class;

public class FuncoesFrutas {
    // variáveis globais
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int qtdeMain;
        qtdeMain = size_frutas();
        cadastrar_dados(qtdeMain);
        System.out.println(finish());

        teclado.close(); //só fechei o teclado quando acabou a utilidade dele
    }
    
    static int size_frutas(){
        int qtdeSize;

        System.out.println("Informe a quantidade de frutas que deseja cadastrar: ");
        qtdeSize = Integer.parseInt(teclado.nextLine());

        
        return qtdeSize;
    }

    static void cadastrar_dados(int qtde) {
        String frutas[];

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
    }

    static String finish(){
        return "\nPrograma concluído!";
    }
}