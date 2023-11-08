package aulas.escolapessoas;

import aulas.aulapessoa.Gringo;

public class AlunoGringo extends Aluno implements Gringo {

    String greenCard;

    public AlunoGringo(String nome, String email, String anoNascimento, String ra, String greenCard) {
        super(nome, email, anoNascimento, ra);
        this.greenCard = greenCard;
    }

    @Override
    public String getGreenCard() {
        return greenCard;
    }
    
}
