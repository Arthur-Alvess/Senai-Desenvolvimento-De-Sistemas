package Exercicios_Criacao_de_Objetos;

import java.util.Locale;
import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("----Matemática----");

        System.out.print("\nInforme sua nota do 1º Semestre: ");
        double nota1Mat = sc.nextDouble();

        System.out.print("\nInforme sua nota do 2º Semestre: ");
        double nota2Mat = sc.nextDouble();

        double mediaMat = calculoMedia(nota1Mat, nota2Mat);

        System.out.println("\n----Português----");

        System.out.print("\nInforme sua nota do 1º Semestre: ");
        double nota1Port = sc.nextDouble();

        System.out.print("\nInforme sua nota do 2º Semestre: ");
        double nota2Port = sc.nextDouble();

        double mediaPort = calculoMedia(nota1Port, nota2Port);

        String resultado = showResult(mediaMat, mediaPort);

        System.out.println(resultado);
        sc.close();
    }

    public static double calculoMedia(double a, double b){

        double aux = (a + b) / 2;

        return aux;
    }

    public static String showResult(double mediaMat, double mediaPort){

        String texto;

        if (mediaMat >= 7 && mediaPort >= 7) {
            texto = "\nO aluno foi aprovado em duas matérias diferentes";
        } else if (mediaMat >= 7  && mediaPort < 7) {
            texto = "\nO aluno foi aprovado apenas em matemática";
        } else if (mediaMat < 7 && mediaPort >= 7) {
            texto = "\nO aluno foi aprovado apenas em português";
        } else {
            texto = "\nO aluno foi reprovado nas duas matérias";
        }

        return texto;
    }
}
