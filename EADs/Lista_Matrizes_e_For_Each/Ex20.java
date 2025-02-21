package EADs.Lista_Matrizes_e_For_Each;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matriz = new int[4][4];

        System.out.println("Informe os valores da matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatriz 4x4:");
        for (int i = 0; i < 4; i++) {
            System.out.print("");
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

        int somaLinha1 = 0, somaLinha2 = 0, somaLinha3 = 0, somaLinha4 = 0; 

        for (int i = 0; i < 4; i++) {
            somaLinha1 += matriz[0][i];
            somaLinha2 += matriz[1][i];
            somaLinha3 += matriz[2][i];
            somaLinha4 += matriz[3][i];
        }

        int somaColuna1 = 0, somaColuna2 = 0, somaColuna3 = 0, somaColuna4 = 0;

        for (int i = 0; i < 4; i++) {
            somaColuna1 += matriz[i][0];
            somaColuna2 += matriz[i][1];
            somaColuna3 += matriz[i][2];
            somaColuna4 += matriz[i][3];
        }

        System.out.println("\nSoma dos elementos da linha 1: " + somaLinha1);
        System.out.println("Soma dos elementos da linha 2: " + somaLinha2);
        System.out.println("Soma dos elementos da linha 3: " + somaLinha3);
        System.out.println("Soma dos elementos da linha 4: " + somaLinha4);
        System.out.println("\nSoma dos elementos da coluna 1: " + somaColuna1);
        System.out.println("Soma dos elementos da coluna 2: " + somaColuna2);
        System.out.println("Soma dos elementos da coluna 3: " + somaColuna3);
        System.out.println("Soma dos elementos da coluna 4: " + somaColuna4 + "\n");

        sc.close();
    }
}
