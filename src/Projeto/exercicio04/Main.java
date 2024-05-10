package Projeto.exercicio04;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        List<Jogador> Jogos = new ArrayList<>();

        Jogador jogador1 = new Jogador("Ana", 1900, 20);
        Jogador jogador2 = new Jogador("Fernanda", 1500, 18);
        Jogador jogador4 = new Jogador("Carlos", 2300, 23);

        Jogos.add(jogador1);
        Jogos.add(jogador2);
    }
}
