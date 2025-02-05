package Exercicio_Laco_For_e_Do_While.Do_While;

import java.util.Scanner;

public class While11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe uma palavra: ");
        String palavra = sc.nextLine();

        System.out.println();

        int cont = 0;

        do {
            System.out.print(palavra.charAt(cont)+"  ");
            cont++;
        }while(cont < palavra.length());
    }
}
