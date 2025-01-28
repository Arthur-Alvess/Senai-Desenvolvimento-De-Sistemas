package Revisao_IfElse.Basicos;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um ano: ");
        int ano = sc.nextInt();
        if (ano % 400 == 0){
            if (ano%4==0 && ano%100 == 0){
                System.out.println(ano+" é um ano bissexto!");
            }
            else{
                System.out.println(ano+" não é um ano bissexto!");
            };
        return;
        }
        if (ano % 4 == 0){
            System.out.println(ano+" é um ano bissexto!");
        }
    }
}

