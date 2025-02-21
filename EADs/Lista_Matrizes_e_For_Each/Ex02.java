package EADs.Lista_Matrizes_e_For_Each;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        List <Integer> numeros = new ArrayList<>();

        for (int i = 1; i <=5; i++){
            System.out.print("Informe o "+ i + " número: ");
            int num = sc.nextInt();
            numeros.add(num);
        }
        for (int i = 0; i < numeros.size(); i++){
            soma += numeros.get(i);
        }
        System.out.println("A soma dos números digitados é: " + soma);
        sc.close();
    }
}
