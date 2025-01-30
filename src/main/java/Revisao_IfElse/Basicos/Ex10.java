package Revisao_IfElse.Basicos;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num = sc.nextInt();

        if (num >= 100 && num <= 200){
            System.out.println("O número digitado está entre 100 e 200");
        }else {
            System.out.println("O número digitado não está entre 100 e 200");
        }
        sc.close();

    }
}
