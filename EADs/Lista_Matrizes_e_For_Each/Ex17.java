package EADs.Lista_Matrizes_e_For_Each;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        
        System.out.print("\nDigite o número escalar para multiplicação: ");
        int escalar = sc.nextInt();

        System.out.println("\nMatriz 3x3 antes da multiplicação:");
        for (int i = 0; i < 3; i++) {
            System.out.print("");
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("\nMatriz resultante após multiplicação:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] *= escalar;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }    
}
