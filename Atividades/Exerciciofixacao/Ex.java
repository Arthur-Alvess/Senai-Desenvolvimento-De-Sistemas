package Exerciciofixacao;

import java.util.Locale;

public class Ex {
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("Products: \n%s, whichpriceis$ %.1f \n%s, whichpriceis$ %.2f", product1, price1, product2, price2);

        System.out.println();

        System.out.printf("\nRecord: %d yearsold, code%d and gender: %s", age, code, gender);

        System.out.println();

        System.out.printf("\nMeasue witheight decimal places: %.8f%nRounded(three decimal places): %.3f%n", measure, measure);

        Locale.setDefault(Locale.US);

        System.out.printf("US decimal point: %.3f", measure);
    }
}
