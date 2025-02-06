package Exercicio_Laco_For_e_Do_While.Do_While;

import java.util.ArrayList;
import java.util.Scanner;

public class While9 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int num = 0;

        do {
            System.out.println("Insira um número (digite um número negativo para cancelar): ");
            num = sc.nextInt();

            if (num >= 0){
                lista.add(num);
            }

        }while(num >=0);

        System.out.println(lista);
        sc.close();
    }
}
