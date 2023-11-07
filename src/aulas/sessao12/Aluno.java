package aulas.sessao12;
import java.util.Arrays;
import java.util.List;

import aulas.aulapessoa.Pessoa;


public class Aluno implements Pessoa {

    private String nome;
    private String email;
    private String anoNascimento;
    private String ra;


    public Aluno(String nome, String email, String anoNascimento, String ra) {
        
        this.nome = nome;
        this.email = email;
        this.anoNascimento = anoNascimento;
        this.ra = ra;
    }

    public String getRA() {
        return this.ra;
    }

    @Override
    public void informations() {
        Pessoa.super.informations();
        System.out.println("RA: " + this.ra);
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getAnoNascimento() {
        return anoNascimento;
    }

    @Override
    public List<String> getPermissions() {
        return Arrays.asList("SALA_AULA");
    }

    public void fazerProva() {
        
    }
}
