package Ex03;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número que deseja saber a raiz quadrada: ");
        int num = sc.nextInt();

        try {
            System.out.println(Math.sqrt(num));
        }
        catch (IllegalArgumentException e){
            System.out.println("Números menores ou iguais a zero não possuem raiz quadrada!");
        }
    }
}
