package aulas.aulaobjeto;
//

//Construtor
public class Pessoa {
    String nome, email;
    int anoNascimento;

    //construtor vazio;
    public Pessoa(){};

    //Construtor com parâmetros
    public Pessoa(String nome, String email, int anoNascimento){
        this.nome = nome;
        this.email = email;
        this.anoNascimento = anoNascimento;
    }
}
