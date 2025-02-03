package Revisao_IfElse.Situacoes_Cotidianas;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva um temperatura em °C ");
        Double Temp = sc.nextDouble();
        sc.nextLine();

        System.out.print("\nDeseja converter para Kelvin?");
        String resposta = sc.nextLine();

        if(resposta.equalsIgnoreCase("sim")){

            System.out.println("\nEm Kelvin fica: " + (Temp + 273.15) + "Kº");

        } else {
            System.out.printf("\nOk tchau!");
        }
        sc.close();
    }
}
