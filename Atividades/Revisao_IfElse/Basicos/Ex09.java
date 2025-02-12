package Revisao_IfElse.Basicos;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num = sc.nextInt();

        if (num >= 10 && num <= 50){
            System.out.println("O número digitado está entre 10 e 50");
        }else {
            System.out.println("O número digitado não está entre 10 e 50");
        }
        sc.close();

    }
}
