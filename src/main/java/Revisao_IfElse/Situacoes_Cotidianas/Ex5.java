package Revisao_IfElse.Situacoes_Cotidianas;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva o usuário");
        String usuario = sc.nextLine();

        System.out.println("Senha: ");
        String senha = sc.nextLine();

        if(senha.equalsIgnoreCase("1234e")){
            System.out.println(usuario + " aprovado");
        } else {
            System.out.println(usuario + " não aprovado");
        }
        sc.close();
    }
}
