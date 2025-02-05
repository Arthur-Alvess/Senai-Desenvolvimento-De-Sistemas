package Exercicio_Laco_For_e_Do_While.Laco_For;

public class For7 {
    public static void main(String[] args) {
        int soma = 0;

        for(int i = 1; i <= 100; i += 2){
            System.out.println(i);
            soma += i;
        }

        System.out.println("\nA soma dos números ímpares de 1 a 100 é " + soma);
    }
}
