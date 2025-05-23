package Exercicio_Laco_For_e_Do_While.Do_While;

import java.util.Scanner;

public class While14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int num = sc.nextInt();
        int cont = 1;

        System.out.println("\nOs divisores de "+num+" são: ");

        do {
            if (num % cont == 0){
                System.out.println(cont);
            }
            cont++;
        }while(cont <= num);

        sc.close();
    }
}
