package Projeto.exercicio05;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        
        List<Carro> Evento = new ArrayList<>();

        Carro carro1 = new Carro("Honda", "Civic", 2022, "SAP2C", 180);
        Carro carro2 = new Carro("Toyota", "Corolla", 2021, "SAP3D", 170);
        Carro carro3 = new Carro("Ford", "Mustang", 2023, "SAP4E", 250);
        Carro carro4 = new Carro("Chevrolet", "Camaro", 2020, "SAP5F", 280);
        Carro carro5 = new Carro("BMW", "X5", 2024, "SAP6G", 220);

        Evento.add(carro1);
        Evento.add(carro2);
        Evento.add(carro3);
        Evento.add(carro4);
        Evento.add(carro5);

        for(Carro carro : Evento){
            carro.acelerar(20);
            carro.frear(1);
            carro.info();
        }
    }
}
