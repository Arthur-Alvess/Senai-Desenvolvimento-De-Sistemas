package Exercicio_Laco_For_e_Do_While.Do_While;

import java.util.Scanner;

public class While17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int num = sc.nextInt();
        sc.close();
        int cont = 2;
        boolean ehPrimo = true;

        do {
            if (num % cont == 0){
                ehPrimo = false;
                break;
            }
            cont++;
        }while(cont < num/2);

        if (ehPrimo && num > 1){
            System.out.println(num + " é um número primo!");
        } else {
            System.out.println(num + " não é um número primo!");
        }
    }
}
