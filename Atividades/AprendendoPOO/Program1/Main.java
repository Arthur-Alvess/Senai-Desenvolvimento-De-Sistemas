package AprendendoPOO.Program1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----------Menu----------");
        System.out.println("1. Buscar Livro");
        System.out.println("2. Buscar Cliente");
        System.out.println("3. Empréstimo de Livro");
        System.out.println("4. Visualizar Estoque");
        System.out.println("5. Gerenciar Estoque");
        System.out.println("------------------------\n");

        System.out.print("Informe o que deseja: ");
        int chose = sc.nextInt();

        switch (chose){
            case 1:

            case 2:

            case 3:

            case 4:

            case 5:

                System.out.println("-O que deseja realizar?-\n");
                System.out.println("1. Adicionar Livro");
                System.out.println("2. Remover Livro");
                System.out.println("------------------------");

                int chose2 = sc.nextInt();

                switch (chose2){
                    case 1:

                    case 2:

                }
        }
        sc.close();
    }
}
