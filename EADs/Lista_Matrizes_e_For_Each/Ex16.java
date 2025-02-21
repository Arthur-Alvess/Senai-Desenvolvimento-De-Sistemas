package EADs.Lista_Matrizes_e_For_Each;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o tamanho da matriz identidade: ");
        int n = sc.nextInt();
        
        int[][] matrizIdentidade = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matrizIdentidade[i][j] = 1;
                } else {
                    matrizIdentidade[i][j] = 0;
                }
            }
        }

        System.out.println("Matriz identidade de tamanho " + n + ":");
        for (int[] linha : matrizIdentidade) {
            for (int elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
