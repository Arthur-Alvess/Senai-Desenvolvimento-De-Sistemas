package EADs.EAD2.Exercicio3;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("\nInforme as notas dos três trimestres do aluno: ");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();
        sc.close();

        Notas aluno = new Notas(nota1, nota2, nota3);

        aluno.situacaoAluno();
    }
}
