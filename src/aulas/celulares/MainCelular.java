package aulas.celulares;

public class MainCelular {
    
    public static void main(String[] args) {
        // Celular cel1 = new Celular("Sansung", "5.4in", 1000.5); 
            //A classe Celular passou a ser abstrata

        CelPlus cel2 = new CelPlus("LG", "6.5in", 2000.50, "Bluetooth", "Plus", "transparente");
        CelPro  cel3 = new CelPro(
            "Apple", "6.8in", 3500, "Bluetooth", null, "Preta", "2 anos", "4500mAh");

        // System.out.println("\nCalular 1: ");
        // cel1.showInfo();

        System.out.println("\nCelular 2: ");
        cel2.showInfo();
        cel2.finalMethod();
        
        System.out.println("\nCelular3: ");
        cel3.showInfo();
        cel3.finalMethod();
        

        // //mesma coisa de:
        // System.out.println("\nCalular 1: ");
        // System.out.println(cel1.toString());
        // System.out.println("\n");
        // System.out.println("\nCelular 2: ");
        // System.out.println(cel2.toString());
    }
}