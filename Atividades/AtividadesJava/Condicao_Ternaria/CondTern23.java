package Condicao_Ternaria;

import java.util.Scanner;

public class CondTern23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe uma senha: ");
        String senha = sc.nextLine();

        sc.close();

        System.out.println((senha.length() < 8)?"\nSenha inválida":"\nSenha válida");
    }
}
