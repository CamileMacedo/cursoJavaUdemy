package aulas.antes.frutas;

public class MainFruits {

    public static void main(String[] args) {
        
        FuncoesFrutas frutas = new FuncoesFrutas();
        FuncoesFrutas frutas2 = new FuncoesFrutas();

        frutas.cadastrarDados(frutas.sizeFruits());
        frutas2.cadastrarDados(frutas2.sizeFruits());

        System.out.println(frutas.finish());
        System.out.println(frutas2.finish());
    }
}
