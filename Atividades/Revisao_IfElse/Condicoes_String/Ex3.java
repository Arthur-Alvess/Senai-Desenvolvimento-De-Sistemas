package Revisao_IfElse.Condicoes_String;

import java.util.Scanner;


public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();


        if (palavra.charAt(0) == 'A' || palavra.charAt(0) == 'a') {
            System.out.println("A palavra começa com a letra 'A'");
        } else {
            System.out.println("A palavra digitada não começa com a letra 'A'");
        }
        sc.close();

    }
}

