package EADs.Lista_Matrizes_e_For_Each;

public class Ex28 {
    public static void main(String[] args) {
        int [][] matriz = {{1,2,3},{4,5,6},{7,8,9}};

        int maior = 0;
        for(int[] linha : matriz){
            for(int i : linha){
                if(i > maior){
                    maior = i;
                }
            }
        }

        System.out.println("Maior elemento da matriz: " + maior);
    }
}
