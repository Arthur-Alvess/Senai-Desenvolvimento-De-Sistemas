package Exercicio_Laco_For_e_Do_While.Do_While;

import java.util.Scanner;

public class While18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 1;

        do {
            System.out.print("Informe um número: ");
            num = sc.nextInt();

            if (num == 0){
                break;
            } else if (num % 2 == 0) {
                System.out.println( num + " é par!");
            } else {
                System.out.println(num + " é ímpar!");
            }
        }while(num != 0);
    }
}
