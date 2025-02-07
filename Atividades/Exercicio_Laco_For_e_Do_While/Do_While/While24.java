package Exercicio_Laco_For_e_Do_While.Do_While;

import java.util.Locale;
import java.util.Scanner;

public class While24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double num = 1;

        do {
            System.out.print("\nInforme um número: ");
            num = sc.nextDouble();

            if (num < 0){
                System.out.println("Número negativo informado, encerrando...");
                break;
            }else {
                System.out.print("Raiz Qaudrada: " + Math.sqrt(num) + "\n");
            }
        }while(num >= 0);
    }
}
