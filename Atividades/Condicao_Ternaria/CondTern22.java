package Condicao_Ternaria;

import java.util.Locale;
import java.util.Scanner;

public class CondTern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Informe o valor do produto: ");
        double valor = sc.nextDouble();

        sc.close();

        System.out.println((valor >= 100)?"\nPossui Frete Grátis":"\nNão Possui Frete Grátis");
    }
}
