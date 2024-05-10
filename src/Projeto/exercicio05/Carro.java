package Projeto.exercicio05;
import java.util.Scanner;

public class Carro {
    
    String marca;
    String modelo;
    int ano;
    String placa;
    int velocidade;

    Carro(String marca, String modelo, int ano, String placa, int velocidade){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidade = velocidade;
    }

    Scanner leitor = new Scanner(System.in);

    public void acelerar(int aumentar){
        velocidade += aumentar;
        System.out.println("Acelerando " +velocidade+"km/h");

    }
    public void frear(int reduzir){
        velocidade -= reduzir;
        if(velocidade < 0){
            velocidade = 0;
        }
    }
    public void info(){
        System.out.println(marca+ " | "+modelo+ " | "+ano+" | "+placa+" | "+velocidade+"km/h");
    }
}
