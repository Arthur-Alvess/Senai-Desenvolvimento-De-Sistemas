package Getters_E_Setters_teste.Programa2;

import Getters_E_Setters_teste.Programa2.entities.ContaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria();

        System.out.print("Informe o nome do titular da conta: ");
        String nome = sc.nextLine();
        conta.setNome(nome);

        System.out.print("Informe o saldo da conta: ");
        double saldo = sc.nextDouble();
        conta.setSaldo(saldo);

        System.out.println("\n--Informe a ação que deseja realizar-- \n1 - Depósito \n2 - Saque");
        int escolha = sc.nextInt();

        switch (escolha){
            case 1:
                System.out.print("\nInforme a quantidade do depósito: ");
                double deposito = sc.nextDouble();
                conta.setDeposito(deposito);
                conta.setSaldo(conta.deposito(conta.getSaldo(), conta.getDeposito()));

                System.out.println("\n--Dados Atualizados-- \nNome: " + conta.getNome() + "\nNovo Saldo: " + conta.getSaldo());
                break;

            case 2:
                System.out.print("\nInforme a quantidade do saque: ");
                double saque = sc.nextDouble();

                if (saque <= saldo) {
                    conta.setSaque(saque);
                    conta.setSaldo(conta.saque(conta.getSaldo(), conta.getSaque()));

                    System.out.println("\n--Dados Atualizados-- \nNome: " + conta.getNome() + "\nNovo Saldo: " + conta.getSaldo());
                    break;
                } else {
                    System.out.println("\nVocê não tem saldo suficiente para realizar o saque no valor de R$" + saque);
                }
        }
    }
}
