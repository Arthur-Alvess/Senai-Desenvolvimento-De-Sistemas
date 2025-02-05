package Exercicio_Laco_For_e_Do_While;

import java.util.Scanner;

public class For9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva o número que deseja a tabuada: ");
        int num = sc.nextInt();

        for (int i = 0; i <= 10; i++){
            System.out.printf("\n%d x %d = %d", num, i, num*i);
        }
        sc.close();
    }
}
