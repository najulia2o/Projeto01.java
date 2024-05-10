package Projeto.exercicio01;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int num01 = Integer.parseInt(leitor.nextLine());

        System.out.print("Informe outro número: ");
        int num02 = Integer.parseInt(leitor.nextLine());

        int soma = num01 + num02;
        int sub = num01 - num02;
        int mult = num01 * num02;
        float div = num01 / num02;

        System.out.println(num01+" + "+num02+" = "+soma);
        System.out.println(num01+" - "+num02+" = "+sub);
        System.out.println(num01+" * "+num02+" = "+mult);

        if (num01 == 0 || num02 ==0) {
            System.out.println("Divisão por zero!!! Informe outro número.");
        }
        else{
            System.out.println(num01+" / "+num02+" = "+div);
        }
        
    }    
}

