package EADs.EAD2.Exercicio2;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Salário Bruto: ");
        double salBruto = sc.nextDouble();
        System.out.print("Imposto: ");
        double tax = sc.nextDouble();

        Salario salario = new Salario(salBruto, tax);

        System.out.println("\nFuncionário: " + nome + ", R$" + salario.salLiquido());

        System.out.print("\nQual o aumento em porcentagem do salário: ");
        double porcentagem = sc.nextDouble();

        System.out.println("\nDados atualizados: " + nome + ", R$" + salario.novoSalario(porcentagem) + "\n");
    }
}
