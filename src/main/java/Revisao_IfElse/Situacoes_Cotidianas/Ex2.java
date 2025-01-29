package Situacoes_Cotidianas;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua senha de acesso: ");
        int  senha = sc.nextInt();

        int senhaReal = 1234;

        if (senha == senhaReal){
            System.out.println("\nAcesso confirmado");
        } else{
            System.out.println("\nAcesso negado");
        }
        sc.close();
    }
}

