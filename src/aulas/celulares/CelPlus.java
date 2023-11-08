package aulas.celulares;

public class CelPlus extends Celular {
    private String fone, carregador, capinha;

    public CelPlus(String marca, String tela, double valor, String fone, String carregador, String capinha) {
        super(marca, tela, valor);
        this.fone = fone;
        this.capinha = capinha;
        this.carregador = carregador;
    }

    @Override
    public void showInfo() {
        System.out.println("Marca da Televisão: "+ getMarca());
        System.out.println("Tela: " + getTela());
        System.out.println("Valor: " + getValor());
        System.out.println("Fone: " + this.fone);
        System.out.println("Capinha: " + this.capinha);
        System.out.println("Carregador: " + this.carregador);
    }

    @Override
    public String toString(){
        return super.toString() +  "\nFone: " + this.fone + "\nCapinha: " + this.capinha + "\nCarregador: " + this.carregador;
    }

    @Override
    public String menssage() {
        return "Impletentei o método abstrato";
    }

}
