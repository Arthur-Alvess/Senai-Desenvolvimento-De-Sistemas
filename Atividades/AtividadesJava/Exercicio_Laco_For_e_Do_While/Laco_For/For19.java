package Exercicio_Laco_For_e_Do_While.Laco_For;

import java.util.Scanner;

public class For19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.print("Informe um número: ");
    int num = sc.nextInt();
    int fatorial = 1;

        for (int i = 2; i<= num; i++) {
            fatorial *= i;
        }
        System.out.printf("O fatoria de %d é igual a %d", num, fatorial);
        sc.close();
    }
}
