import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Informe os números da soma:");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            System.out.println(num1 + num2);
        }
        catch (InputMismatchException e){
            System.out.println("Informe um número!");
        }

        System.out.println("Encerrando programa...");

    }
}
