package Condicao_Ternaria;

import java.util.Scanner;

public class CondTern30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe suas duas notas: ");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();

        sc.close();

        System.out.println(((nota1 + nota2) / 2 >= 6)?"Aprovado":"Reprovado");
    }
}   
