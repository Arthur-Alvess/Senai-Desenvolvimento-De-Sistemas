package EADs.Lista_Matrizes_e_For_Each;

public class Ex27 {
    public static void main(String[] args) {
        int [][] matriz = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        
        int soma = 0;

        for (int[] linha : matriz){
            for (int i : linha){
                System.out.print(i + " ");
                soma+= i;
            }
            System.out.println();
        }

        System.out.println("Soma dos elementos da matriz: " + soma);
    }
}
