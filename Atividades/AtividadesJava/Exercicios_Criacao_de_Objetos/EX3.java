package Exercicios_Criacao_de_Objetos;

import java.util.Locale;
import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Informe a temperatura: ");
        double tempC = sc.nextDouble();

        double tempF = conversorTemperaturaParaF(tempC);

        System.out.println(tempF);
        sc.close();
    }

    public static double conversorTemperaturaParaF(double a){
        double temperatura = (a * 9 / 5) + 32;
        return temperatura;
    }
}
