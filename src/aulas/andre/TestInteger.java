package aulas.andre;

public class TestInteger {

    //particularidade do java, no integer ele reutiliza aq instancia do objeto de -128 a 127.
    // entaõ, a comparação abaixo além destes números será False pois a instancia será outra.

    public static void main(String[] args){
        Integer a = 128;
        Integer b = 128;

        if(a == b){
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}