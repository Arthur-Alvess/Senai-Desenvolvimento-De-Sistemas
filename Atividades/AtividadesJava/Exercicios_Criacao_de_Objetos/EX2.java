package Exercicios_Criacao_de_Objetos;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe dois números: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        verificadorSinal(num1);

        System.out.println("\n"+num1 + " "+ verificadorSinal(num1));

        verificadorSinal(num2);

        System.out.println(num2 + " " + verificadorSinal(num2));
        sc.close();
    }

    public static String verificadorSinal(int a){
        String txt;
        if (a > 0){
            txt = "é um número positivo";
        }else if (a == 0){
            txt = "número igual a 0";
        }else {
            txt = "é um número negativo";
        }
        return txt;
    }
}
