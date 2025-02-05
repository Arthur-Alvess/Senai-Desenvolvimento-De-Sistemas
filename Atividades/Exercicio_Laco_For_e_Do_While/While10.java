package Exercicio_Laco_For_e_Do_While;

import java.sql.SQLOutput;
import java.util.Scanner;

public class While10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número: ");

        int cont = 0;

        do {
            int num = sc.nextInt();
            if (num > 0){
                cont++;
            }else if (num == 0){
                break;
            }
        }while(true);
        System.out.println("A quantidade de números positivos digitados foi: "+ cont);
    }
}
