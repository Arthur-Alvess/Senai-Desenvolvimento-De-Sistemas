package Revisao_IfElse.Basicos;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        if (num % 5 == 0){
            System.out.println(num + " é multiplo por 5!");
        }else {
            System.out.println(num + " não é multiplo por 5!");
        }
        sc.close();

    }
}
