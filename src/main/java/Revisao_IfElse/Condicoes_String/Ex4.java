package Revisao_IfElse.Condicoes_String;

import java.util.Scanner;


public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Informe uma palavra: ");
        String palavra = sc.nextLine();


        if (palavra.length() > 5) {
            System.out.println(palavra + " contém mais de 5 caracteres");
        }else{
            System.out.println(palavra + " não contém mais de 5 caracteres");
        }
    }
}