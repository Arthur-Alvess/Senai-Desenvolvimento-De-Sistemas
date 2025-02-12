package Revisao_IfElse.Basicos;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o 1º número: ");
        int num1 = sc.nextInt();
        System.out.println("Agora digite o 2º número: ");
        int num2 = sc.nextInt();

        if (num1 > num2){
            System.out.println(num1 + " é maior que " + num2);
        }else if (num2 > num1){
            System.out.println(num2 + " é maior que " + num1);
        }else{
            System.out.println("Os números informados são iguais");
        }
        sc.close();
    }
}
