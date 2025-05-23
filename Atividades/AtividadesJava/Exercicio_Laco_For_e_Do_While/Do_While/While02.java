package Exercicio_Laco_For_e_Do_While.Do_While;

import java.util.Scanner;

public class While02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int soma = 0;

        do {
            System.out.println("Informe um número(0 para parar):");
            int num = sc.nextInt();

            if (num > 0){
                soma += num;
            }
            if (num == 0){
                break;
            }

        }while(true);

        System.out.println("A soma dos números informados é " +soma );

        sc.close();
    }
}
