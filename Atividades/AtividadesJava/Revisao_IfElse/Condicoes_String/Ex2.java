package Revisao_IfElse.Condicoes_String;

import java.util.Scanner;


public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senha = "1234";

        String tentativa;

        do {
            System.out.print("Digite a senha: ");
            tentativa = sc.nextLine();


            if (!tentativa.equals(senha)) {
                System.out.println("Senha incorreta! Tente novamente.");
            }

        } while (!tentativa.equals(senha));


        System.out.println("Acesso permitido!");

        sc.close();

    }
}
