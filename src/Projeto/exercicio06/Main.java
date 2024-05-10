package Projeto.exercicio06;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Contato[] Agenda = null;

    public static void main(String[] args) {
        List<Contato> Agenda = new ArrayList<>(); 

        Contato contato1 = new Contato("Ana Julia", 419686875);
        Contato contato2 = new Contato("Fernanda", 419871713);
        Contato contato3 = new Contato("Carla", 419121314);
        Contato contato4 = new Contato("Bruno", 419123452);
        Contato contato5 = new Contato("Bianca", 410967832);
        Contato contato6  = new Contato("Junior", 419010305);
        Contato contato7 = new Contato("Felipe", 419002892);

        Agenda.add(contato1);
        Agenda.add(contato2);
        Agenda.add(contato3);
        Agenda.add(contato4);
        Agenda.add(contato5);
        Agenda.add(contato6);
        Agenda.add(contato7);

        for(Contato contato: Agenda){
            System.out.println("Contato: "+contato.name+" | "+contato.telefone);
        }
    }
}
