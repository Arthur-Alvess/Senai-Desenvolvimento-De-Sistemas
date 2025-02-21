package EADs.Lista_Matrizes_e_For_Each;

import java.util.Arrays;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] nomes = new String[5];

        System.out.println("Informe 5 nomes: ");
        for (int i = 0; i < nomes.length; i++){
            String aux = sc.nextLine();
            nomes[i] = aux;
        }

        Arrays.sort(nomes);

        System.out.println("\nOs nomes digitados em ordem alfabética são: ");
        for (String nome : nomes) {
            System.out.println(nome);
        }
        sc.close();
    }
}
