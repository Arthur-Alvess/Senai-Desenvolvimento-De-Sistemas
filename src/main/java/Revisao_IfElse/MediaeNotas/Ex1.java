package Revisao_IfElse.MediaeNotas;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a 1ª nota: ");
        float nota1 = sc.nextFloat();
        System.out.println("Informe a 2ª nota:");
        float nota2 = sc.nextFloat();

        float media = (nota1 + nota2) / 2;

        if (media >= 7){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
    }
}
