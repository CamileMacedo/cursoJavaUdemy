package aulas.aulapessoa;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import aulas.escolapessoas.Aluno;
import aulas.escolapessoas.AlunoGringo;
import aulas.escolapessoas.Professor;
import aulas.escolapessoas.ProfessorGringo;

public class MainPessoa {
    public static void main(String[] args) {
 

        Aluno aluno1 = new Aluno("Camile", "camile@gmail.com", "2003", "BP3033058");
        Aluno alunoGringo = new AlunoGringo("Aluno Gringo", "alunogringo@gmail.com", "2003", "BP3033058", "ghwuhgwiurg");

        Professor professor = new Professor("Professor Brasileiro", "profbr@gmail.com", "2003", "hhiuogwrgIHOU");
        Professor professorGringo = new ProfessorGringo("Professor Gringo", "profgringo@gmail.com", "2003", "hhiuogwrgIHOU", "comGreenCard");


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
