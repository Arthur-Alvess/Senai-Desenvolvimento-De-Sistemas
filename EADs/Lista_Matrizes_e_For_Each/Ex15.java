package EADs.Lista_Matrizes_e_For_Each;

public class Ex15 {
    public static void main(String[] args) {
        int [][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("Matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            System.out.print("");
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

        int somaDiagonalSecundaria = 0;
        for (int i = 0; i < 3; i++) {
            somaDiagonalSecundaria += matriz[i][2 - i];
        }

        System.out.println("A soma dos elementos da diagonal secundária da matriz 3x3 é: " + somaDiagonalSecundaria);
    }
}
