package Revisao_IfElse.Basicos;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 16){
            System.out.println("Você já pode votar!");
        }else{
            System.out.println("Você ainda não pode votar!");
        }
        sc.close();
    }
}
