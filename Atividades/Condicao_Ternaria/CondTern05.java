package Condicao_Ternaria;

import java.util.Scanner;

public class CondTern05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um ano: ");
        int ano = sc.nextInt();

        sc.close();

        System.out.println((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0) ? "\nAno bissexto" : "\nAno não bissexto");
    }

}
