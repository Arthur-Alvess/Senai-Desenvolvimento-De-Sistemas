package Revisao_IfElse.Operacoes_Matematicas;

import java.util.Scanner;


public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Informe um número: ");
        float num1 = sc.nextFloat();
        System.out.print("\nInforme o outro número da soma: ");
        float num2 = sc.nextFloat();


        float soma = num1 + num2;


        if (soma > 100) {
            System.out.println("\nA soma dos números informados é maior que 100");
        } else {
            System.out.println("\nA soma dos números informados é menor ou igual a 100");
        }
        sc.close();

    }
}