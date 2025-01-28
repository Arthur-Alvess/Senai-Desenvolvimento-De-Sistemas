package Revisao_IfElse.Operacoes_Matematicas;

import java.util.Scanner;


public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Informe um número: ");
        int num1 = sc.nextInt();
        System.out.print("Informe outro número: ");
        int num2 = sc.nextInt();


        if (num1 % num2 == 0) {
            System.out.println(num1 + " é divisível por " + num2);
        }else if (num2 % num1 == 0) {
            System.out.println(num2 + " é divisível por " + num1);
        } else {
            System.out.println("Os números informados não são divisiveis um pelo outro");
        }
    }
}

