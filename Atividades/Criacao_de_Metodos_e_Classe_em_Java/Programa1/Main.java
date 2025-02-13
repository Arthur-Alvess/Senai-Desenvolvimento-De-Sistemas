package Criacao_de_Metodos_e_Classe_em_Java.Programa1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a 1ª nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Informe a 2ª nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("Informe a 3ª nota: ");
        double nota3 = sc.nextDouble();

        Nota notas = new Nota(nota1, nota2, nota3);

        notas.showResult();

        sc.close();
    }

}
