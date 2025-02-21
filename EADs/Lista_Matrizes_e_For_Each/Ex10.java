package EADs.Lista_Matrizes_e_For_Each;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] lista1 = new int[5];
        int[] lista2 = new int[5];
        int[] lista3 = new int[10];

        System.out.println("Informe 5 números para a primeira lista: ");
        for (int i = 0; i < lista1.length; i++) {
            lista1[i] = sc.nextInt();
        }

        System.out.println("Informe 5 números para a segunda lista: ");
        for (int i = 0; i < lista2.length; i++) {
            lista2[i] = sc.nextInt(); 
        }

        for (int i = 0; i < lista1.length; i++) {
            lista3[i] = lista1[i];
        }

        for (int i = 0; i < lista2.length; i++) {
            lista3[i + 5] = lista2[i]; 
        }

        System.out.println("A terceira lista é: ");
        for (int i = 0; i < lista3.length; i++) {
            System.out.print(lista3[i] + " ");
        }
        sc.close();
    }
}
