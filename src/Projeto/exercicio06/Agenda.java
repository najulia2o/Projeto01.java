package Projeto.exercicio06;
import java.util.List;
import java.util.ArrayList;

public class Agenda {
    List<Contato> contatos= new ArrayList<>();

    public void adicionar(Contato contato){
        contatos.add(contato);
    }

    public Contato buscar(String name){
        for(Contato contato: contatos){
            if (contato.getName().equalsIgnoreCase(name)) {
                return contato;
            }
        }
        return null;
    }
     public void remover(String name){
        Contato contato = buscar(name);

        if (contato != null) {
            contatos.remove(contato);
        }
        else{
            System.out.println("Contato não encontrado!");
        }
     }
    public void mostrar(){
        System.out.println("--Lista de contatos--");
        for(Contato contato: contatos){
            System.out.println("Contato: "+contato.getName()+" "+contato.getTelefone());
        }
    }
}
