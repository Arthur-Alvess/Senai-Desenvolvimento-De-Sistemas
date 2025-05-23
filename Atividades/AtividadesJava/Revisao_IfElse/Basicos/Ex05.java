package Revisao_IfElse.Basicos;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o 1º número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o 2º número: ");
        int num2 = sc.nextInt();
        System.out.println("Digite o 3º número: ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println(num1 + " é o maior número digitado!");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " é o maior número digitado!");
        } else {
            System.out.println(num3 + " é o maior número digitado!");
        }
        sc.close();

    }
}
