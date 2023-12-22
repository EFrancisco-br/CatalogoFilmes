package Catalogo;
import java.time.LocalDate;
public class Diretor extends Pessoa{

    Diretor(){

    }
    Diretor(String nome, LocalDate nascimento, String nacionalidade){
        super(nome, nascimento, nacionalidade);
    }
}
