package Condicao_Ternaria;

import java.util.Scanner;

public class CondTern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe dois números diferentes: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        sc.close();

        System.out.println((a > b)?a:b);
    }
}
