package aulas.eletronicos;

public class Ventilador implements InterfaceEletronico{
    private String nomeVent, categoria;
    private boolean ligado = false;

    public Ventilador(String nomeVent, String categoria){
        this.nomeVent = nomeVent;
        this.categoria = categoria;
    }

    @Override
    public String getNomeEle() {
        return this.nomeVent;
    }

    @Override
    public String getCategoriaEle() {
        return this.categoria;
    }

    @Override
    public void ligar() {
        if (!this.ligado){
            this.ligado = true;
            System.out.println("O " + this.nomeVent + " foi LIGADO!");
        }
    }

    @Override
    public void desligar() {
        if (this.ligado){
            this.ligado = false;
            System.out.println("O " + this.nomeVent + " foi DESLIGADO!");
        }
    }

}
