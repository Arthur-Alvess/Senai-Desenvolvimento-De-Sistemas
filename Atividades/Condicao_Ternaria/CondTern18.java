package Condicao_Ternaria;

import java.util.Scanner;

public class CondTern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os três lados do triângulo: ");
        int lado1 = sc.nextInt();
        int lado2 = sc.nextInt();
        int lado3 = sc.nextInt();

        sc.close();

        System.out.println((lado1 == lado2 && lado2 == lado3)?"Triângulo Equilátero":(lado1 == lado2 && lado2 != lado3 || lado3 == lado1 && lado1 != lado2 || lado2 == lado3 && lado3 != lado1)?"Triângulo Isósceles": "Triângulo Escaleno");
    }
}
