package Exercicio_Laco_For_e_Do_While.Do_While;

import java.util.Scanner;

public class While13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        String num = sc.nextLine();

        int cont = 0;
        int soma = 0;

        do {
            soma += Integer.parseInt(num.substring(cont, cont+1));
            cont++;
        }while(cont < num.length());
        System.out.println("\nA soma dos algarismos do número informado é: " + soma);
    }
}
