package Criacao_de_Metodos_e_Classe_em_Java.Programa3;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Informe sua altura (em metros): ");
        double h = sc.nextDouble();

        Alturas altura = new Alturas(h);

        System.out.println(altura.classificacaoAltura(h));
    }
}
