package EADs.EAD2.Exercicio1;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Informe a base do retângulo: ");
        double base = sc.nextDouble();
        System.out.print("Informe a altura do retangulo: ");
        double altura = sc.nextDouble();

        sc.close();

        Retangulo retangulo = new Retangulo(base, altura);

        retangulo.showResult();
    }
}
