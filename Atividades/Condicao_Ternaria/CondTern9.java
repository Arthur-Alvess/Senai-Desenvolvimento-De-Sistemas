package Condicao_Ternaria;

import java.util.Scanner;

public class CondTern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe 2 números: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        sc.close();

        System.out.println((a > b)?"Maior":"Menor ou Igual");
    }
}
