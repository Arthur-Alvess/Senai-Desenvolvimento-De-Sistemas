package Revisao_IfElse.Operacoes_Matematicas;

import java.util.Scanner;


public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Informe um número: ");
        float num1 = sc.nextFloat();
        System.out.print("\nInforme outro número: ");
        float num2 = sc.nextFloat();


        float dif = num1 - num2;


        if (dif < 0) {
            System.out.println("\nA diferença entre os dois números é negativa");
        } else if (dif > 0) {
            System.out.println("\nA diferença entre os dois números é positiva");
        } else {
            System.out.println("\nNão há diferença entre os números");
        }
        sc.close();

    }
}

