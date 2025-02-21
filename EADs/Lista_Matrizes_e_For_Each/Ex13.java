package EADs.Lista_Matrizes_e_For_Each;

public class Ex13 {
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
        
        int maior = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                if (matriz[i][j] > maior){
                    maior = matriz[i][j];
                }
            }
        }

        System.out.println("O maior número da matriz 3x3 é: " + maior);
    }
}   
