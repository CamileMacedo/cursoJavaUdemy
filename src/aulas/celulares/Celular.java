package aulas.celulares;

public abstract class Celular {
    private String marca, tela;
    private double valor;
    private int idCel;

    private static int contador = 1;

    public Celular (String marca, String tela, double valor) {
        this.idCel = contador;
        this.marca = marca;
        this.tela = tela;
        this.valor = valor;
        Celular.contador = Celular.contador + 1;
    }

    public int getIdCel() {
        return idCel;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getTela() {
        return this.tela;
    }

    public double getValor() {
        return this.valor;
    }

    

    public abstract void showInfo();
        //Corpo do showInfo, tirei para entender a aula de classe abstrata
        // System.out.println("Marca da Televisão: "+ this.marca);
        // System.out.println("Tela: " + this.tela);
        // System.out.println("Valor: " + this.valor);


    public abstract String menssage();

    public final void finalMethod(){
        System.out.println("\nExecutando o método (final), não posso alterá-lo fora da classe abstrata");
        System.out.println("\nNão é obrigatório");
    }

    @Override
    public String toString(){
        return ("Marca da Televisão: "+ this.marca + "\nTela: " + this.tela + "\nValor: " + this.valor);
    }
}