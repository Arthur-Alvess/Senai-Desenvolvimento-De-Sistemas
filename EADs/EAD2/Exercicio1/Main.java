package EADs.EAD2.Exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Informe as medidas de largura e altura do retângulo respectivamente: ");
        double l = sc.nextDouble();
        double h = sc.nextDouble();

        Retangulo retangulo1 = new Retangulo(l, h);

        System.out.println("Area = " + retangulo1.areaRetangulo(l, h));
        System.out.println("Perimetro = " + retangulo1.perimetroRetangulo(l, h));
        System.out.println("Diagonal = " + retangulo1.diagonalRetangulo(l, h));
    }
}
