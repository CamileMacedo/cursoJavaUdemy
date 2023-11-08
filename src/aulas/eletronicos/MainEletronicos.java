package aulas.eletronicos;

public class MainEletronicos {
    
    public static void main(String[] args) {
    Ventilador vent1 = new Ventilador("Ventilador Philco", "Ventilação");

        vent1.ligar();
        vent1.desligar();
        System.out.println("\n");
        vent1.infoEletronics();
    }
}