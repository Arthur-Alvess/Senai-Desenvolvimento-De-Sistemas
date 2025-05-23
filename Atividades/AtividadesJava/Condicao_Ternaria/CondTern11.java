package Condicao_Ternaria;

import java.util.Scanner;

public class CondTern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe uma letra: ");
        char letra = Character.toUpperCase(sc.next().charAt(0));
        sc.close();

        System.out.println(("AEIOU".indexOf(letra) >= 0) ? "\nVogal" : "\nConsoante");
    }
}
