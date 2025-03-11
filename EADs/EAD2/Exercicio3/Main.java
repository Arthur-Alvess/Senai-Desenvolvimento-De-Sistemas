package EADs.EAD2.Exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Informe o nome do aluno: ");
        String name = sc.nextLine();
        System.out.println("Notas do aluno");
        System.out.print("1º Trimestre: ");
        double nota1 = sc.nextDouble();
        System.out.print("2º Trimestre: ");
        double nota2 = sc.nextDouble();
        System.out.print("3º Trimestre: ");
        double nota3 = sc.nextDouble();

        Notas notas = new Notas(nota1, nota2, nota3);


    }
}
