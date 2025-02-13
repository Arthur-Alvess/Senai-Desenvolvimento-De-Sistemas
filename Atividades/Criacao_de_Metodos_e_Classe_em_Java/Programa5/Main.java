package Criacao_de_Metodos_e_Classe_em_Java.Programa5;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Informe sua idade: ");
        int idade = sc.nextInt();
        System.out.print("Informe seu peso: ");
        double peso = sc.nextDouble();

        Doacao doacao = new Doacao(idade, peso);

        System.out.println(doacao.verificadorPodeDoar(idade, peso));
    }
}
