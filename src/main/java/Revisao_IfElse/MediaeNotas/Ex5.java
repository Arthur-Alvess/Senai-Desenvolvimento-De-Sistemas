package Revisao_IfElse.MediaeNotas;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("----Matemática----");
        System.out.print("\nInforme sua nota do 1º Semestre: ");
        float nota1Mat = sc.nextFloat();
        System.out.print("\nInforme sua nota do 2º Semestre: ");
        float nota2Mat = sc.nextFloat();


        float mediaMat = (nota1Mat + nota2Mat) / 2;


        System.out.println("\n----Português----");
        System.out.print("\nInforme sua nota do 1º Semestre: ");
        float nota1Port = sc.nextFloat();
        System.out.print("\nInforme sua nota do 2º Semestre: ");
        float nota2Port = sc.nextFloat();


        float mediaPort = (nota1Port + nota2Port) / 2;


        if (mediaMat >= 7 && mediaPort >= 7) {
            System.out.println("\nO aluno foi aprovado em duas matérias diferentes");
        } else if (mediaMat >= 7  && mediaPort < 7) {
            System.out.println("\nO aluno foi aprovado apenas em matemática");
        } else if (mediaMat < 7 && mediaPort >= 7) {
            System.out.println("\nO aluno foi aprovado apenas em português");
        } else {
            System.out.println("\nO aluno foi reprovado nas duas matérias");
        }
        sc.close();
    }
}
