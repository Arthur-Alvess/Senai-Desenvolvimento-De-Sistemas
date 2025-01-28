package Revisao_IfElse.MediaeNotas;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a 1ª nota: ");
        float nota1 = sc.nextFloat();
        System.out.println("Informe a 2ª nota:");
        float nota2 = sc.nextFloat();
        System.out.println("Informe a 3ª nota:");
        float nota3 = sc.nextFloat();

        if (nota1 > nota2 && nota1 > nota3){
            System.out.println(nota1 + " é a maior nota!");
        }else if (nota2 > nota1 && nota2 > nota3){
            System.out.println(nota2 + " é a maior nota!");
        } else {
            System.out.println(nota3 + " á a maior nota!");
        }

        if (nota1 < nota2 && nota1 < nota3){
            System.out.println(nota1 + " é a menor nota!");
        }else if (nota2 < nota1 && nota2 < nota3){
            System.out.println(nota2 + " é a menor nota!");
        } else {
            System.out.println(nota3 + " á a menor nota!");
        }
    }
}
