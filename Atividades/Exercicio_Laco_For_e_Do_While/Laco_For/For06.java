package Exercicio_Laco_For_e_Do_While.Laco_For;

public class For06 {
    public static void main(String[] args) {
        int soma = 0;

        for(int i = 0; i <= 100; i += 2){
            System.out.println(i);
            soma += i;
        }

        System.out.println("A soma dos números pares de 1 a 100 é " + soma);
    }
}
