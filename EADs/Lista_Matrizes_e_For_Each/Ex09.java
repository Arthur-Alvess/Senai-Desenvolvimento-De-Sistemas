package EADs.Lista_Matrizes_e_For_Each;

public class Ex09 {
    public static void main(String[] args) {
        int [] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Os números do vetor são: ");
        for (int numero : numeros){
            System.out.print(numero + " ");
        }

        System.out.println();
        System.out.print("\nA ordem inversa dos números do vetor é: ");
        for (int i = numeros.length - 1; i >= 0; i--){
            System.out.print(numeros[i] + " ");
        }
    }
}
