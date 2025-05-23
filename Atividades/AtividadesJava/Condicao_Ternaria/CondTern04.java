package Condicao_Ternaria;

import java.util.Scanner;

public class CondTern04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int num = sc.nextInt();

        sc.close();

        System.out.println((num % 5 == 0)? "\nMúltiplo de 5" : "\nNão é múltiplo de 5");
    }

}
