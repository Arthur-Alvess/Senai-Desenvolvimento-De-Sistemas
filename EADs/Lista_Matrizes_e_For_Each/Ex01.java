package EADs.Lista_Matrizes_e_For_Each;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();
        
        for (int i = 1; i <= 5; i++){
            System.out.print("Informe o " + i + " número: ");
            int num = sc.nextInt();
            numeros.add(num);
        }
        System.out.println("Os números digitados foram: " + numeros);
        sc.close();
    }
}
