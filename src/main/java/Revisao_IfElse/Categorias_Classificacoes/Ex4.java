package Revisao_IfElse.Categorias_Classificacoes;

import java.util.Scanner;


public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Informe sua Pressão Arterial Sistólica (PAS): ");
        int pas = sc.nextInt();
        System.out.print("\nInforme sua Pressão Arterial Diastólica (PAD): ");
        int pad = sc.nextInt();


        if (pas < 140 && pad < 90) {
            System.out.println("\nPressão Arterial Normal");
        } else if (pas < 180 && pad < 110) {
            System.out.println("\nPressão Arterial Moderada");
        } else {
            System.out.println("\nPressão Arterial Alta");
        }
    }
}

