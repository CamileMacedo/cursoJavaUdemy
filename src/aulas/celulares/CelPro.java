package aulas.celulares;

public class CelPro extends CelPlus {
    private String seguro, bateria;
    
    public CelPro(String marca, String tela, double valor, String fone, String carregador, String capinha, String seguro, String bateria) {
        super(marca, tela, valor, fone, carregador, capinha);
        this.seguro = seguro;
        this.bateria = bateria;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Seguro: " + this.seguro);
        System.out.println("Bateria: " + this.bateria);
    }

}
