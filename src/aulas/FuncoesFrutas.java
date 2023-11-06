package aulas;


/* Uma função deve ter:
* - Tipo de retorno
* - Nome
* - Parâmetros/argumentos de entrada
* - 
*/

import java.util.Scanner;


public class FuncoesFrutas {

    private Scanner teclado;
    private String frutas[];

    //Construtor da classe
    public FuncoesFrutas() {
        System.out.println("Criou instancia\n");

        
        this.frutas = new String[0];
        this.teclado = new Scanner(System.in);
    }

    public int sizeFrutas(){
        int qtdeSize;

        System.out.println("Informe a quantidade de frutas que deseja cadastrar: ");
        qtdeSize = Integer.parseInt(teclado.nextLine());
        
        return qtdeSize;
    }

    public void cadastrarDados(int qtde) {
        //definindo o tamanho
        frutas = new String[qtde];

        for(int i = 0; i < frutas.length; i++){
            System.out.println("Informe o nome da Fruta: ");
            frutas[i] = teclado.nextLine();
        }        
    }

    public String finish(){
        System.out.println("\n");

        for(int j=0; j < frutas.length; j++){
            System.out.println(frutas[j]);
        }

        teclado.close();
        return "\nItens cadastrados com sucesso!";
    }

    //Programa executado no main/Main.java
    //.
    //.
    // public static void main(String[] args) {
    //     int qtdeMain;

    //     FuncoesFrutas instancia = new FuncoesFrutas();

    //     qtdeMain = instancia.sizeFrutas();
    //     instancia.cadastrarDados(qtdeMain);
    //     System.out.println(instancia.finish());

    //      //só fechei o teclado quando acabou a utilidade dele
    // }
}