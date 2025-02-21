package EADs.Lista_Matrizes_e_For_Each;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex04 {
    public static void main(String[] args) {

        Random random = new Random();
        List <Integer> numeros = new ArrayList<>(10);

        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(100);
            numeros.add(num);
        }

        System.out.print("Números aleatórios gerados: ");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i) + " ");
        }
        
        int maior = 0;
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) > maior) {
                maior = numeros.get(i);
            }
        }

        int menor = 100;
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) < menor) {
                menor = numeros.get(i);
            }
        }

        System.out.print("\nO maior número gerado foi: " + maior);
        System.out.print("\nO menor número gerado foi: " + menor);
    }
}
