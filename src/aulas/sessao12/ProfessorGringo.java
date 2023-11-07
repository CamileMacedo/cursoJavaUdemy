package aulas.sessao12;

import aulas.aulapessoa.Gringo;

public class ProfessorGringo extends Professor implements Gringo {

    String greenCard;

    public ProfessorGringo(String nome, String email, String anoNascimento, String numeroRegistro, String greenCard) {
        super(nome, email, anoNascimento, numeroRegistro);
      
        this.greenCard = greenCard;
    }

    @Override
    public String getGreenCard() {
        return greenCard;
    }
    
}
