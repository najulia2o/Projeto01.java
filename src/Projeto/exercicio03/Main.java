package Projeto.exercicio03;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Conta> banco = new ArrayList<Conta>();

        Conta conta = new Conta(1415, "Ana", 1400);
        
        conta.depositar(500.0);
        conta.sacar(200.0);
        conta.sacar(1500.0); 

        System.out.println("Saldo atual da conta: R$ " + conta.getSaldo());
        
    }
    


}
