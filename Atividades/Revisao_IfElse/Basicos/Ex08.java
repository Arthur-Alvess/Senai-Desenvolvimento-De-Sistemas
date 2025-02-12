package Revisao_IfElse.Basicos;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um caractere: ");
        char letra = sc.nextLine().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            System.out.println(letra + " é uma vogal");
        } else {
            System.out.println(letra + " é uma consoante");
        }
        sc.close();

    }
}
