package Revisao_IfElse.Condicoes_String;

import java.util.Scanner;


public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite Sim ou Não: ");
        String palavra = sc.nextLine();


        if (palavra.equalsIgnoreCase("Sim")) {
            System.out.println("\nA palavra digitada doi 'Sim'");
        } else if (palavra.equalsIgnoreCase("Não")) {
            System.out.println("\nA palavra digitada foi 'Não'");
        } else {
            System.out.println("\nA palavra não foi digitada corretamente!");
        }
        sc.close();
    }
}

