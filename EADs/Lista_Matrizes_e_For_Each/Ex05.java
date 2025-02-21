package EADs.Lista_Matrizes_e_For_Each;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numeros = {1, 2, 3, 4, 5, 6};

        System.out.print("Informe um número: ");
        int num = sc.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == num) {
                System.out.println("O número " + num + " já está no vetor e está na posição " + i + ".");
                break;
            }
        }
        sc.close();
    }
}
