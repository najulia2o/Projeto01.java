package Projeto.exercicio07;
import java.util.List;
import java.util.Scanner;

public class Produto {
    
    String produto;
    int id;
    int qtd;
    float valor;

    Produto(String produto, int id, int qtd, float valor){
        this.produto = produto;
        this.id= id;
        this.qtd = qtd;
        this.valor = valor;
    }

    Scanner leitor = new Scanner(System.in);

    public void mostrar(){
        System.out.println("Produto: "+produto);
        System.err.println("ID: "+id);
        System.out.println("Quantidade em estoque: "+qtd);
        System.out.println("R$"+valor);
        System.out.println("-------------------------------");
    }

}
