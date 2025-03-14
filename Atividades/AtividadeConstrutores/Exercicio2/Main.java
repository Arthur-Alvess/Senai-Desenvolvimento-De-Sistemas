package Exercicio2;

import Exercicio2.entities.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pessoa person;

        System.out.print("Informe seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Informe sua idade: ");
        String idade = sc.nextLine();

        if (nome.isEmpty() && idade.isEmpty()){
            person = new Pessoa();
        } else {
            person =  new Pessoa(nome, idade);
        }

        person.showResult();
    }
}
