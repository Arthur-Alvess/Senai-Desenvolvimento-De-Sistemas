package EADs.Lista_Matrizes_e_For_Each;

import java.util.Arrays;
import java.util.List;

public class Ex21 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(10,20,30,40,50);

        System.out.println("Elementos da lista:");
        for (int i : lista){
            System.out.println(i);
        }
    }
}
