package Criacao_de_Metodos_e_Classe_em_Java.ProgramaDocumento7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira 3 números diferentes: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Maior maior = new Maior(a, b, c);

        maior.showResult();

        sc.close();
    }
}
