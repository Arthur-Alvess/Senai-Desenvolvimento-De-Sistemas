package Exercicio_Laco_For_e_Do_While.Do_While;

import java.util.Scanner;

public class While12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe uma palavra: ");
        String palavra = sc.nextLine();

        int cont = palavra.length() - 1;

        do {
            System.out.print(palavra.charAt(cont));
            cont--;
        }while(cont >= 0);
    }
}
