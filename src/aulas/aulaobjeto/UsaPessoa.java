package aulas.aulaobjeto;

public class UsaPessoa {
    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Camile Macedo";
        pessoa1.email = "camile@gmail.com";
        pessoa1.anoNascimento = 2003;

        System.out.println("Nome: " + pessoa1.nome);
        System.out.println("Emaiil: " + pessoa1.email);
        System.out.println("Data de nascimento: " + pessoa1.anoNascimento);

        Pessoa pessoa2 = new Pessoa("João", "joao@gmail.com", 2000);

        System.out.println("Nome: " + pessoa2.nome);
        System.out.println("Emaiil: " + pessoa2.email);
        System.out.println("Data de nascimento: " + pessoa2.anoNascimento);
    }
}
