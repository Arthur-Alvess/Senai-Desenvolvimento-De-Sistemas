package EADs.Lista_Matrizes_e_For_Each;

public class Ex29 {
    public static void main(String[] args) {
        int [][] matriz = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("Matriz: ");
        for (int[] linha : matriz){
            for (int i : linha){
                System.out.print(i + " ");
            }
            System.out.println();
        }

        int somaColuna1 = 0;
        int somaColuna2 = 0;
        int somaColuna3 = 0;

        for(int[] linha : matriz){
            for(int i = 0; i < linha.length; i++){
                if(i == 0){
                    somaColuna1 += linha[i];
                } else if(i == 1){
                    somaColuna2 += linha[i];
                } else {
                    somaColuna3 += linha[i];
                }
            }
        }

        System.out.println("\nSoma da coluna 1: " + somaColuna1);
        System.out.println("Soma da coluna 2: " + somaColuna2);
        System.out.println("Soma da coluna 3: " + somaColuna3);
    }
}
