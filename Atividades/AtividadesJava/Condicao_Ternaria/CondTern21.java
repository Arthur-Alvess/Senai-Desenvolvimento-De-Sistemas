package Condicao_Ternaria;

import java.util.Scanner;

public class CondTern21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe um número: ");
        int num = sc.nextInt();
        
        sc.close();

        System.out.println((num > 0 && num % 2 == 0)?"\nPar e Positivo": (num < 0 && num % 2 == 0)?"\nPar e Negativo": (num > 0 && num % 2 != 0)? "\nÍmpar e Positivo": "\nÍmpar e Negativo");
    }
}
