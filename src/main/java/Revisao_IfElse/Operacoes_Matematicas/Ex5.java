package Revisao_IfElse.Operacoes_Matematicas;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int num = sc.nextInt();

        if (num * num == (num^2)){
            System.out.println("\n" + num + " é um quadrado perfeito");
        } else {
            System.out.println("\n" + num + " não é um quadrado perfeito");
        }
    }
}
