package aulas.aulapessoa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import aulas.sessao12.Aluno;
import aulas.sessao12.AlunoGringo;
import aulas.sessao12.Professor;
import aulas.sessao12.ProfessorGringo;

public class UsaPessoa {
    public static void main(String[] args) {
 

        Aluno aluno1 = new Aluno("Camile", "camile@gmail.com", "2003", "BP3033058");
        Aluno alunoGringo = new AlunoGringo("Aluno Gringo", "camile@gmail.com", "2003", "BP3033058", "ghwuhgwiurg");

        Professor professor = new Professor("Camile Professora", "camile@gmail.com", "2003", "hhiuogwrgIHOU");
        Professor professorGringo = new ProfessorGringo("Professor Gringo", "camile@gmail.com", "2003", "hhiuogwrgIHOU", "comGreenCard");


        List<Pessoa> pessoasEscola = Arrays.asList(aluno1, alunoGringo, professor, professorGringo);

        for (Pessoa pessoa : pessoasEscola) {
            
            if (pessoa instanceof Gringo) {
                pessoa.informations();
                System.out.println("\n");
            }else if (pessoa instanceof Professor) {
                System.out.println("Professor Brasileiro de nome: " + pessoa.getNome());
                System.out.println("\n");
            }
            
        }

    }
}
