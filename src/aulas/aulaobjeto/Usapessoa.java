package aulas.aulaobjeto;
import aulas.aulaobjeto.Pessoa;

public class Usapessoa {
    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Camile Macedo";
        pessoa1.email = "camile@gmail.com";
        pessoa1.anoNascimento = 2003;

        Pessoa pessoa2 = new Pessoa("João", "joao@gmail.com", 2000);

        pessoa1.Informations();
        System.out.println("\n");
        pessoa2.Informations();
    }
}
