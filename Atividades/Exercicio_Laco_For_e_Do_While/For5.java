package Exercicio_Laco_For_e_Do_While;

public class For5 {
    public static void main(String[] args) {
        int soma = 0;

        for(int i = 0; i <= 100; i ++){
            System.out.println(i);
            soma += i;
        }

        System.out.println("A soma dos números de 1 a 100 é " + soma);
    }
}
