package aulas.eletronicos;

public interface InterfaceEletronico {

    public String getNomeEle();
    public String getCategoriaEle();

    static String MARCAE = "Generico";

    public void ligar();

    public void desligar();

    public default void infoEletronics(){
        System.out.println("Nome do eletrônico: " + getNomeEle());
        System.out.println("Categoria do eletrônico: " + getCategoriaEle());
        System.out.println("Marca do eletrônico" + MARCAE);
    }
}
