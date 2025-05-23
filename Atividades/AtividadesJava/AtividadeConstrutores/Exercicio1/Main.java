package Exercicio1;

import Exercicio1.entities.Carro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a marca do veículo: ");
        String marca = sc.nextLine();

        System.out.print("Informe o ano do veículo: ");
        int ano = sc.nextInt();

        Carro car = new Carro(marca, ano);

        car.showResult();
    }
}
