package Catalogo;
import java.time.LocalDate;
public class Pessoa {
    String nome;
    LocalDate nascimento;
    String nacionalidade;

    Pessoa() {

    }
    Pessoa(String nome, LocalDate nascimento, String nacionalidade){
        this.nome = nome;
        this.nascimento = nascimento;
        this.nacionalidade = nacionalidade;
    }

    public String getPessoaToPrint(){
        return nome + " (" + nascimento + ", " + nacionalidade + ")";
    }
}
