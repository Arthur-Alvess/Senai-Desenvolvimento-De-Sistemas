package Condicao_Ternaria;

import java.util.Scanner;

public class CondTern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        int idade = sc.nextInt();
        System.out.print("Você é estudante (S/N)? ");
        String estudante = sc.nextLine().toUpperCase();

        sc.close();

        System.out.println((estudante.equals("S") || idade > 60)?"\nPossui direito à desconto" :"Não possui direito à desconto");
    }
}
