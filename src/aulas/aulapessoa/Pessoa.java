package aulas.aulapessoa;
//

//Construtor
public class Pessoa {
    String nome, email;
    int anoNascimento;

    //construtor vazio;
    public Pessoa(){};

    //Construtor com parâmetros
    Pessoa(String nome, String email, int anoNascimento){
        this.nome = nome;
        this.email = email;
        this.anoNascimento = anoNascimento;
    }

    void Informations(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Emaiil: " + this.email);
        System.out.println("Data de nascimento: " + this.anoNascimento);
    }
}