package EADs.Lista_Matrizes_e_For_Each;

import java.util.Arrays;
import java.util.List;

public class Ex24 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        for (int i : lista){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
