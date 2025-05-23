package Getters_E_Setters_teste.Programa3;

import Getters_E_Setters_teste.Programa3.entities.Produtos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produtos product = new Produtos();

        System.out.print("Informe o nome do produto: ");
        String nome = sc.nextLine();
        product.setNome(nome);

        System.out.print("Informe o preço do produto: ");
        double preco = sc.nextDouble();
        product.setPreco(preco);

        System.out.print("Informe a quantidade em estoque deste produto: ");
        int quantEstoque = sc.nextInt();
        product.setQuantEstoque(quantEstoque);

        System.out.println("\n--Informe o que deseja realizar-- \n1 - Adicionar quantidade ao estoque \n2 - Remover quantidade do estoque");
        int escolha = sc.nextInt();

        switch (escolha){
            case 1:
                System.out.print("\nInforme a quantidade que deseja adicionar: ");
                int quantAdd = sc.nextInt();
                product.setQuantAdd(quantAdd);
                product.setQuantEstoque(product.addQuant(product.getQuantEstoque(), product.getQuantAdd()));

                System.out.println("\n--Informações do produto atualizadas-- \nNome: " + product.getNome() + "\nPreço: R$" + product.getPreco() + "\nQuantidade em estoque: " + product.getQuantEstoque());
                break;

            case 2:
                System.out.print("\nInforme a quantidade que deseja remover: ");
                int quantRemove = sc.nextInt();

                if (quantRemove <= product.getQuantEstoque()){
                    product.setQuantRemove(quantRemove);
                    product.setQuantEstoque(product.removeQuant(product.getQuantEstoque(), product.getQuantRemove()));

                    System.out.println("\n--Informações do produto atualizadas-- \nNome: " + product.getNome() + "\nPreço: R$" + product.getPreco() + "\nQuantidade em estoque: " + product.getQuantEstoque());
                    break;
                } else {
                    System.out.println("\nQuantidade desejada para remover não existente no estoque!");
                }
        }
    }
}
