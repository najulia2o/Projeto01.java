package Projeto.exercicio03;
import java.util.Scanner;

public class Conta {
    
    private int nConta;
    private String titular;
    private float saldo;

    Conta(int nConta, String titular, float saldo){
        this.nConta = nConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    Scanner leitor = new Scanner(System.in);

   public void depositar(double d){
        if (d > 0) {
            saldo += d;
            System.out.println("Depósito de R$ " + d + " realizado com sucesso!");
        } else {
            System.out.println("Valor inválido.");
        }
    }
    public double getSaldo() {
        return saldo;

    }
    public void sacar(double d) {
        
        throw new UnsupportedOperationException("Unimplemented method 'sacar'");
    }

   
}
