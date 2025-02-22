package EADs.Lista_Matrizes_e_For_Each;

import java.util.List;
import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        List<Integer> lista = List.of(10,20,30,40,50);

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o multiplicar dos numeros da lista: ");
        int multiplicador = sc.nextInt();
        sc.close();

        System.out.println("Elementos da lista multiplicados:");
        for (int i : lista){
            System.out.println(i * multiplicador);
        }

    }
}
