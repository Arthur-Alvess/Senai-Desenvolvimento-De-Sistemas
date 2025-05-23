package Program;

import Models.Triangulo;

import java.util.Locale;
import java.util.Scanner;
import static Models.Triangulo.VerificarMaior;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the measures of triangle X: ");
        double Xa = sc.nextDouble();
        double Xb = sc.nextDouble();
        double Xc = sc.nextDouble();

        Triangulo TrianguloX = new Triangulo(Xa,Xb,Xc);


        System.out.println("Enter the measures of triangle Y: ");
        double Ya = sc.nextDouble();
        double Yb = sc.nextDouble();
        double Yc = sc.nextDouble();

        Triangulo TrianguloY = new Triangulo(Ya,Yb,Yc);

        VerificarMaior(TrianguloX, TrianguloY);
        sc.close();

    }

}
