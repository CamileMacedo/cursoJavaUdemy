package aulas.aulaobjeto;

public class UsaPessoa {
    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa(); //usando o construtor vazio

        pessoa1.nome = "Camile Macedo";
        pessoa1.email = "camile@gmail.com";
        pessoa1.anoNascimento = 2003;

        Pessoa pessoa2 = new Pessoa("João", "joao@gmail.com", 2000); //usando o construtor com parâmetros

        pessoa1.Informations();
        System.out.println("\n");
        pessoa2.Informations();
    }
}
