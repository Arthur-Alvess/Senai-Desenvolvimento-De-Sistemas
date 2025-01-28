package Revisao_IfElse.Decisoes_Financeiras;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Informe o saldo de sua conta: ");
        float saldo = sc.nextFloat();


        if (saldo > 20) {
            System.out.println("\nVocê pode realizar um saque");
        } else {
            System.out.println("\nSaldo insuficiente para realizar um saque");
        }
    }
}
