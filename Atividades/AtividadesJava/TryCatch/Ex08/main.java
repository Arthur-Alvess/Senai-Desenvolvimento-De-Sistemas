package Ex08;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Informe sua idade: ");
            int idade = sc.nextInt();
            if (idade < 0) {
                throw new IdadeInvalidaException("Idade inválida, precisa ser superior à ZERO!");
            }
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro: Entrada inválida!");
        }
    }
}
