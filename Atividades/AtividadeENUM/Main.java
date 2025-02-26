package AtividadeENUM;


import AtividadeENUM.entities.Produto;
import AtividadeENUM.entities.StatusPedido;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n");

        Produto produto1  = new Produto(101, "Calça Legging Feminina", 75.90);
        Produto produto2  = new Produto(102, "Camisa Dry-Fit Masculina", 58.99);
        Produto produto3  = new Produto(103, "Chinelo Kenner", 199.90);
        Produto produto4  = new Produto(104, "Óculos de Sol", 129.90);


        System.out.println("-------------------------Produtos em Estoque-------------------------");

        System.out.println(produto1);
        System.out.println(produto2);
        System.out.println(produto3);
        System.out.println(produto4);

        System.out.println("---------------------------------------------------------------------");
        System.out.print("\nInforme o ID do produto que deseja adquirir: ");
        int escolha = sc.nextInt();

        StatusPedido statusPedido2 = StatusPedido.Preparando;
        StatusPedido statusPedido3 = StatusPedido.Em_Deslocamento;
        StatusPedido statusPedido4 = StatusPedido.Finalizado;

        switch (escolha){
            case 101:
                StatusPedido statusPedido1 = StatusPedido.Aguardando_Pagamento;

                System.out.println("\nCarrinho: \n" + produto1 + "\nStatus: "+ statusPedido1);

                break;

            case 102:
                StatusPedido statusPedido5 = StatusPedido.Aguardando_Pagamento;

                System.out.println("\nCarrinho: \n" + produto2 + "\nStatus: "+ statusPedido5);
                break;

            case 103:
                StatusPedido statusPedido6 = StatusPedido.Aguardando_Pagamento;

                System.out.println("\nCarrinho: \n" + produto3 + "\nStatus: "+ statusPedido6);
                break;

            case 104:
                StatusPedido statusPedido7 = StatusPedido.Aguardando_Pagamento;

                System.out.println("\nCarrinho: \n" + produto4 + "\nStatus: "+ statusPedido7);
                break;
        }


        System.out.println("\nStatus dos outros pedidos: ");
        System.out.println("\nSapato social: " + statusPedido2);
        System.out.println("Notebook Gamer: " + statusPedido3);
        System.out.println("Mouse Gamer: " + statusPedido4);
    }
}
