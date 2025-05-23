package Condicao_Ternaria;

import java.util.Scanner;

public class CondTern26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        int idade = sc.nextInt();

        sc.close();

        System.out.println((idade >= 16)?"\nPode votar!":"\nAinda não pode votar!");
    }
}
