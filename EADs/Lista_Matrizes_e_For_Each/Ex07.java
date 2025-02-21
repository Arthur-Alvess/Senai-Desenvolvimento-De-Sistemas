package EADs.Lista_Matrizes_e_For_Each;

import java.util.Arrays;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++){
            System.out.print("\nInforme o " + (i + 1) + " número: ");
            numeros[i] = sc.nextInt();
        }

        Arrays.sort(numeros);

        System.out.println("\nOs números digitados em ordem crescente são: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        sc.close();
    }
}
