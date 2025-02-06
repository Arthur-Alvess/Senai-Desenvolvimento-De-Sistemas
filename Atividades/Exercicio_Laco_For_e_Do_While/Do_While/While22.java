package Exercicio_Laco_For_e_Do_While.Do_While;

import java.util.Scanner;

public class While22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 1;
        sc.close();
        int cont = 2;
        boolean ehPrimo = true;

        do {
            for (int i = 1; i <= 10; i++){
                if (num % cont == 0){
                    ehPrimo = false;
                    break;
                }
                cont++;
            }while(cont < num/2);

            if (ehPrimo && num > 1){
                System.out.println(num);
            }
        }while(true);
    }
}
