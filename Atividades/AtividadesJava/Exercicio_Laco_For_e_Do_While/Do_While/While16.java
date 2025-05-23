package Exercicio_Laco_For_e_Do_While.Do_While;

import java.util.Scanner;

public class While16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int num = sc.nextInt();
        int cont = 1;

        do {
            System.out.printf("\n%d x %d = %d", num,cont,num*cont);
            cont++;
        }while(cont <=10);

        sc.close();
    }
}
