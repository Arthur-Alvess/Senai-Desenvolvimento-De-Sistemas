package Exercicio_Laco_For_e_Do_While;

public class For28 {
    public static void main(String[] args) {
        int [] num = {3, 8, 14, 22, 37, 45, 54, 68, 79, 91};

        double tam = num.length;
        double soma= 0;

        for (int i = 0; i<tam; i++){
            soma += num[i];
        }

        System.out.println("A média dos números do vetor é: "+ soma/tam);
    }
}
