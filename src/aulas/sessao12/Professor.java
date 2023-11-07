package aulas.sessao12;

import java.util.Arrays;
import java.util.List;

import aulas.aulapessoa.Pessoa;

public class Professor implements Pessoa {

    private String nome;
    private String email;
    private String anoNascimento;
    private String numeroRegistro;

    public Professor(String nome, String email, String anoNascimento, String numeroRegistro) {
        this.nome = nome;
        this.email = email;
        this.anoNascimento = anoNascimento;
        this.numeroRegistro = numeroRegistro;
    }

    @Override
    public void informations() {
        Pessoa.super.informations();

        System.out.println("Numero Registro: " + this.numeroRegistro);

    }

    public String getNumeroRegistro() {
        return numeroRegistro;
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
        return Arrays.asList("SALA_AULA", "SALA_PROFESSORES");
    }

    public void darNota() {
        System.out.println("Atribuiu as Notas\n");
    }

    public void corrigirProva() {
        System.out.println("Coorigiu provas!\n");
    }
    
}
