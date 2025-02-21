package EADs.Lista_Matrizes_e_For_Each;

public class Ex18 {
    public static void main(String[] args) {
        int [][] matriz = new int[4][4];

        for (int i = 0; i < 4; i++){
            for (int j =0; j < 4; j++){
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }

        System.out.println("Matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            System.out.print("");
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

        double soma = 0;
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                if (i == j){
                    soma += matriz[i][j];
                }
            }
        }

        System.out.println("A média dos valores da matriz 4x4 é: " + (soma / 4));
        
    }
}
