package EADs.Lista_Matrizes_e_For_Each;

public class Ex26 {
    public static void main(String[] args) {
        int [][] matriz = {{1,2,3},{4,5,6},{7,8,9}};

        for (int[] linha : matriz){
            for (int i : linha){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
