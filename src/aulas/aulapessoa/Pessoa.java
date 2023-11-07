package aulas.aulapessoa;
//

import java.util.List;
import java.util.stream.Collectors;

//Construtor
public interface Pessoa {
    
    String getNome();

    String getEmail();

    String getAnoNascimento();

    List<String> getPermissions();

    public default void informations(){
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Data de nascimento: " + getAnoNascimento());
        System.out.println("Permissão: " + getPermissions().stream().collect(Collectors.joining(", ")));
    }
}