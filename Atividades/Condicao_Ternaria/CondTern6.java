package Condicao_Ternaria;

import java.util.Scanner;

public class CondTern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        int idade = sc.nextInt();
        System.out.print("Possui habilitação? (S/N): ");
        char habilitacao = Character.toUpperCase(sc.next().charAt(0));

        sc.close();

        System.out.println((idade >= 18 && habilitacao == 'S') ? "\nPode dirigir" : "\nNão pode dirigir");
    }

}
