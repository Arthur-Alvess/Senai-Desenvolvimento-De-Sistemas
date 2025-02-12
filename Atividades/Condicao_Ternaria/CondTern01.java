package Condicao_Ternaria;

import java.util.Scanner;

public class CondTern01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Escreva um número :");
        int num = sc.nextInt();

        sc.close();

        System.out.println((num % 2 == 0) ? "\nPar" : "\nÍmpar");
    }
}
