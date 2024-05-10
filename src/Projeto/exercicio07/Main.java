package Projeto.exercicio07;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        List<Produto> mercado = new ArrayList<>();

        Produto produto1 = new Produto("Traquinas", 12, 54, 7.00f);
        Produto produto2 = new Produto("Leite", 10, 102, 9.00f);
        Produto produto3 = new Produto("Margarina", 6, 77, 11.50f);
        Produto produto4 = new Produto("Ração Golden", 7, 8, 102.90f);
        Produto produto5 = new Produto("Bolo de chocolate", 25, 25, 6.50f);
        Produto produto6 = new Produto("Brahma", 37, 40, 5.90f);

        mercado.add(produto1);
        mercado.add(produto2);
        mercado.add(produto3);
        mercado.add(produto4);
        mercado.add(produto5);
        mercado.add(produto6);

        addproduto(mercado);

        for(Produto produtos:mercado){
            System.out.println("-------------------------------");
            produtos.mostrar();
        }   
        
    }
    public static void addproduto(List<Produto>mercado ) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Produto: ");
        String produto = leitor.nextLine();

        System.out.print("ID: ");
        int id = Integer.parseInt(leitor.nextLine());

        System.out.print("Quantidade em estoque: ");
        int qtd = Integer.parseInt(leitor.nextLine());

        System.out.print("R$");
        float valor = Float.parseFloat(leitor.nextLine());

        Produto novProduto = new Produto(produto, id, qtd, valor);
 
    }
    
    
}
