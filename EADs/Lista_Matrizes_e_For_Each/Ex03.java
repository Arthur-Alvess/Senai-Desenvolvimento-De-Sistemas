package EADs.Lista_Matrizes_e_For_Each;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        int soma = 0;
        List <Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 6; i++){
            System.out.print("Informe o " + (i+1) + " número: ");
            int num = sc.nextInt();
            numeros.add(num);
            soma += numeros.get(i);
        }
        int tam = numeros.size();
        System.out.println("Os números digitados foram: " + numeros);
        System.out.println("A soma dos números digitados é: " + soma);
        System.out.println("A média dos números digitados é: " + (soma / tam));
        sc.close();
    }
}
