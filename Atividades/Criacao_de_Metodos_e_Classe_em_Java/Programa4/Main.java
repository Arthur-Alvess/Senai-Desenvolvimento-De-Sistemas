package Criacao_de_Metodos_e_Classe_em_Java.Programa4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int num1 = sc.nextInt();
        System.out.print("\nInforme outro número: ");
        int num2 = sc.nextInt();

        Numeros num = new Numeros(num1, num2);

        System.out.println(num.verificadorMaiorQueODobro(num1, num2));
    }
}
