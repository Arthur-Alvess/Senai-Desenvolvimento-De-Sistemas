package EADs.Lista_Matrizes_e_For_Each;

public class Ex06 {
    public static void main(String[] args) {
        int [] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Os números do vetor são: ");

        for (int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }
        System.out.print("\nOs números do vetor sem os números ímpares são: ");
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] % 2 == 0){
                System.out.print(numeros[i] + " ");
            }
        }
        System.out.println("\n");
    }
}
