package Ex06;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        try{
            System.out.print("Informe seu nome: ");
            String nome = sc.nextLine();
            if (nome.isEmpty()){
                throw new DadosInvalidosException("Não pode ser vazio");
            }
            System.out.print("Informe sua idade: ");
            int idade = sc.nextInt();
            if (idade < 0){
                throw new DadosInvalidosException("Idade não pode ser negativa!");
            }

            System.out.println("Nome: " + nome + "\nIdade: " + idade);
        }
        catch (DadosInvalidosException e) {
            System.out.println("Erro:" + e.getMessage());
        }
        catch (Exception e){
            System.out.println("Erro: Entrada inválida");
        }


    }
}
