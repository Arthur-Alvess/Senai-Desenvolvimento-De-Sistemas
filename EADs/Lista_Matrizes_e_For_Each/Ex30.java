package EADs.Lista_Matrizes_e_For_Each;

import java.util.Arrays;
import java.util.List;

public class Ex30 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(12, -3, 4, 8, 9, 10, -1, 0, 3, -5);

        System.out.println("Elementos da lista:");
        for (int i : lista){
            System.out.print(i + " ");
        }

        System.out.println("\nElementos da lista substituindo os negativos por 0:");

        for(int i : lista){
            if (i >= 0){
                System.out.print(i + " ");
            } else {
                System.out.print(0 + " ");
            }
        }
    }
}
