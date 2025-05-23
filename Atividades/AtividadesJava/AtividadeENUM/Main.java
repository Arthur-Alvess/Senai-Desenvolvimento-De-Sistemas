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
        sc.nextLine();  // Consome o caractere de nova linha após nextInt()

        StatusPedido statusPedido1 = StatusPedido.Aguardando_Pagamento;

        switch (escolha) {
            case 101:
                System.out.println("\nCarrinho: \n" + produto1 + "\nStatus: " + statusPedido1);
                break;

            case 102:
                System.out.println("\nCarrinho: \n" + produto2 + "\nStatus: " + statusPedido1);
                break;

            case 103:
                System.out.println("\nCarrinho: \n" + produto3 + "\nStatus: " + statusPedido1);
                break;

            case 104:
                System.out.println("\nCarrinho: \n" + produto4 + "\nStatus: " + statusPedido1);
                break;

            default:
                System.out.println("ID informado não encontrado!");
                break;
        }

        System.out.println("\nDeseja verificar o status de outro pedido?(S/N)");
        String desejo = sc.nextLine().toLowerCase();

        if (desejo.charAt(0) == 's') {
            System.out.println("\nInforme o ID do produto: ");
            int numeroID = sc.nextInt();
            sc.nextLine();

            switch (numeroID) {
                case 110:
                    System.out.println("\nSapato social: " + StatusPedido.Preparando);
                    break;
                case 111:
                    System.out.println("\nNotebook Gamer: " + StatusPedido.Em_Deslocamento);
                    break;
                case 112:
                    System.out.println("\nMouse Gamer: " + StatusPedido.Finalizado);
                    break;
                default:
                    System.out.println("Produto não encontrado!");
                    break;
            }
        }
        sc.close();
    }
}
