package Exercicio_Laco_For_e_Do_While;

import java.util.Scanner;

public class For17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe uma palavra: ");
        String palavra = sc.nextLine();

        int tam = palavra.length();

        for (int i = tam-1; i>=0; i--){
            System.out.print(palavra.charAt(i) + " ");
        }
        sc.close();
    }
}
