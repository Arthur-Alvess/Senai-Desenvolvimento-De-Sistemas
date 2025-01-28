package Revisao_IfElse.MediaeNotas;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a 1ª nota: ");
        float nota1 = sc.nextFloat();
        System.out.println("Informe a 2ª nota:");
        float nota2 = sc.nextFloat();

        float media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >=5 && media < 7) {
            System.out.println("Em recuperação");
        } else {
            System.out.println("Reprovado");
        }

        if (nota1 == 10){
            System.out.println("Tirou nota máxima na 1ª nota");
        }
        if (nota2 == 10){
            System.out.println("Tirou nota máxima na 2ª nota");
        }
    }
}
