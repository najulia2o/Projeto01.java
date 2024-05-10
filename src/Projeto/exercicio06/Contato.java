package Projeto.exercicio06;
import java.util.List;
import java.util.ArrayList;

public class Contato {
    String name;
    int telefone;

    Contato(String name, int telefone){
        this.name = name;
        this.telefone = telefone;
    }
    String getName(){
        return name;
    }
    int getTelefone(){
        return telefone;
    }
}
