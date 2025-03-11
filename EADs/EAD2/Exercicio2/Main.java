package EADs.EAD2.Exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Salário Bruto: ");
        double salBruto = sc.nextDouble();
        System.out.print("Imposto: ");
        double tax = sc.nextDouble();

        Salario salario = new Salario(salBruto, tax);

        System.out.println("\nFuncionário: " + name + ", R$" + salario.salarioLiquido(salBruto, tax));

        System.out.print("\nQual a porcentagem de aumento do salário: ");
        double porcentagem = sc.nextDouble();

        System.out.println(salario.novoSalario(porcentagem));


    }
}
