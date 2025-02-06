package Condicao_Ternaria;

import java.util.Scanner;

public class CondTern28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int num = sc.nextInt();

        sc.close();

        System.out.println((num >= 20 && num <= 30)?"\nEstá no intervalo": "\nNão está no intervalo");
    }
}
