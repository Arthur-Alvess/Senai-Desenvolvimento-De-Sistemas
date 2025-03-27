package Ex07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Insira as três notas:");
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            double nota3 = sc.nextDouble();

            System.out.println((nota1 + nota2 + nota3) / 3);
        }
        catch (InputMismatchException e){
            System.out.println("Entrada Inválida!");
        }
        catch (Exception e){
            System.out.println("Erro na entrada!");
        }
    }
}
