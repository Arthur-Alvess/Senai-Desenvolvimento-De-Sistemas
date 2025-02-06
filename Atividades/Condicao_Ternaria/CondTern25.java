package Condicao_Ternaria;

import java.util.Scanner;

public class CondTern25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o dia da semana: ");
        String dia = sc.nextLine();

        sc.close();

        System.out.println((dia.equalsIgnoreCase("sabado") || dia.equalsIgnoreCase("domingo"))?"\nFim de semana":"\nDia Útil");
    }
}
