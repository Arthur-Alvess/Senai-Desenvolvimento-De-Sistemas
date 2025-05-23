package Exercicio_Laco_For_e_Do_While.Do_While;

import java.util.Scanner;

public class While15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe até que número a Sequencia de Fibonacci deve ir: ");
        int num = sc.nextInt();
        int a = 0, b = 1;

        do {
            System.out.print(a+ " ");
            int proximo = a+b;
            a=b;
            b=proximo;
        }while(a < num);
        sc.close();
    }
}
