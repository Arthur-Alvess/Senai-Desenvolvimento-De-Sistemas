package Ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Informe dois números:");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            double divisao = num1 / num2;

            System.out.println(divisao);
        }
        catch (ArithmeticException e){
            System.out.println("Não se pode dividir por ZERO!");
        }

        System.out.println("Finalizando programa...");
    }
}
