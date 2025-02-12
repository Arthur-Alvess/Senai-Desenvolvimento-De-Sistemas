package Condicao_Ternaria;

import java.util.Scanner;

public class CondTern08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe sua nota: ");
        double nota = sc.nextDouble();

        sc.close();

        System.out.println((nota >= 7)? "\nAprovado" : "\nReprovado");


        
    }
}
