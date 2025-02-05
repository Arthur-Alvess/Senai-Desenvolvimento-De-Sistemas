package Exercicio_Laco_For_e_Do_While;

import java.util.Scanner;

public class For18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine().toLowerCase();

        boolean ehPalindromo = true;
        int tam = palavra.length();

        for (int i = 0; i < tam / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(tam - 1 - i)) {
                ehPalindromo = false;
                break;
            }
        }

        if (ehPalindromo) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }

        sc.close();
    }
}

