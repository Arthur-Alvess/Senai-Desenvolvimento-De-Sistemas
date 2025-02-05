package Exercicio_Laco_For_e_Do_While;

import java.util.Scanner;

public class For21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        String num = sc.nextLine();

        sc.close();

        int soma = 0;

        for (int i = 0; i < num.length() ; i++) {
            soma += Integer.parseInt(num.substring(i, i+1));
        }

        System.out.println("A soma dos algarismos é: " + soma);
    }

}
