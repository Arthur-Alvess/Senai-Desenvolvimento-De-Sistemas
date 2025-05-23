package Getters_E_Setters_teste.Programa1;

import Getters_E_Setters_teste.Programa1.entities.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pessoa pessoa1 = new Pessoa();

        System.out.print("Informe seu nome: ");
        String nome = sc.nextLine();
        pessoa1.setNome(nome);

        System.out.print("Informe sua idade: ");
        int idade = sc.nextInt();
        pessoa1.setIdade(idade);

        System.out.println("\n--Informações do usuário-- \nNome: " + pessoa1.getNome() + "\nIdade: " + pessoa1.getIdade());

    }
}
