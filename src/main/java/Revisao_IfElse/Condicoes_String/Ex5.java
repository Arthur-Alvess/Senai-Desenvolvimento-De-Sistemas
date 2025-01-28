package Revisao_IfElse.Condicoes_String;

import java.util.Scanner;


public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Informe a 1ª palavra: ");
        String palavra1 = sc.nextLine();
        System.out.print("\nInforme a 2ª palavra: ");
        String palavra2 = sc.nextLine();


        if (palavra1.equalsIgnoreCase(palavra2)) {
            System.out.println("As palavras digitadas são iguais!");
        }else{
            System.out.println("As palavras digitadas são diferentes!");
        }
    }
}

