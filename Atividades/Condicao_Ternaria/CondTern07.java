package Condicao_Ternaria;

import java.util.Scanner;

public class CondTern07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int num = sc.nextInt();

        sc.close();

        System.out.println((num % 2 == 0 && num > 0) ? "\nSim" : "\nNão");
    }

}
