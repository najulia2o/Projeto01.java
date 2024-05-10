package Projeto.exercicio02;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        List<Livros> biblioteca = new ArrayList<Livros>();

        Livros livro1 = new Livros("Senhor dos aneis", "J.R.R TOLKIEN",1954 );
        Livros livro2 = new Livros("O pequeno principe", "Antone De Saint Exupery",1943 );
        Livros livro3 = new Livros("O Alquimista", "Pedro Coelho",1988 );
        Livros livro4 = new Livros("Corte de Rosas e espinhos", "Sarah J.M.",2015 );
        Livros livro5 = new Livros("Reino das Bruxas", "Krerri Maniscalco",2022 );

        biblioteca.add(livro1);
        biblioteca.add(livro2);
        biblioteca.add(livro3);
        biblioteca.add(livro4);
        biblioteca.add(livro5);

        adicionarLivro(biblioteca);

        for (Livros livro : biblioteca) {
            System.out.println(livro.titulo + " - " + livro.autor + " (" + livro.ano + ")");
        }
    }
     public static void adicionarLivro(List<Livros> biblioteca) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o título do livro:");
        String titulo = scanner.nextLine();

        System.out.println("Digite o autor do livro:");
        String autor = scanner.nextLine();

        System.out.println("Digite o ano de publicação do livro:");
        int ano = scanner.nextInt();

        Livros novoLivro = new Livros(titulo, autor, ano);
        biblioteca.add(novoLivro);

        System.out.println("Livro adicionado à biblioteca com sucesso!");
        scanner.close();
    }
}
