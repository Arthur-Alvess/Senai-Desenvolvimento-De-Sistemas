package Exercicios_Laco_For;

import java.util.Scanner;

public class For16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe uma palavra: ");
        String palavra = sc.nextLine();

        for (int i = 0; i<palavra.length(); i++){
            System.out.print(palavra.charAt(i) + " ");
        }
    }
}
