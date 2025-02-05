package Exercicio_Laco_For_e_Do_While.Laco_For;

public class For27 {
    public static void main(String[] args) {
        int [] num = {4, 7, 9, 16, 23, 45, 52, 67, 71};
        
        int soma = 0;

        for (int i = 0; i < num.length; i++){
            soma += num[i];
        }

        System.out.printf("\nA soma dos números do vetor é: %d", soma);
    }
}
