package Condicao_Ternaria;

import java.util.Scanner;

public class CondTern24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        sc.close();
        
        // Condição ternária para verificar se o número é perfeito
        String resultado = verificaNumeroPerfeito(numero) ? "\nPerfeito" : "\nNão perfeito";
        
        System.out.println(resultado);
    }

    public static boolean verificaNumeroPerfeito(int n) {
        int somaDivisores = 0;
        
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                somaDivisores += i;
            }
        }
        
        return somaDivisores == n;
    }
}
