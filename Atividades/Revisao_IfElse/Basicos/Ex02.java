package Revisao_IfElse.Basicos;

import  java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        System.out.println("Digite um número: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println(num + " é um número par!");
        } else {
            System.out.println(num + " é um número ímpar!");
        }
        sc.close();
    }
}
