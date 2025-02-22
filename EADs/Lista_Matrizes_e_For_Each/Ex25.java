package EADs.Lista_Matrizes_e_For_Each;

import java.util.Arrays;
import java.util.List;

public class Ex25 {
    public static void main(String[] args) {
        List <String> nomes = Arrays.asList("Ana", "Maria", "João", "Pedro", "José");

        for (String nome : nomes){
            System.out.println("Olá, " + nome + "!");
        }
    }
}
