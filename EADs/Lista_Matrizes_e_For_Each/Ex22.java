package EADs.Lista_Matrizes_e_For_Each;

import java.util.Arrays;
import java.util.List;

public class Ex22 {
    public static void main(String[] args) {
        List <Integer> lista = Arrays.asList(10,20,30,40,50);

        int soma = 0;

        for (int i : lista){
            soma += i;
        }
        System.out.println("Soma dos elementos da lista: " + soma);
    }
}
