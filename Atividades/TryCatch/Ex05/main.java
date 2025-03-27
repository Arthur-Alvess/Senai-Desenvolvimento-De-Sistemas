package Ex05;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int []lista = {1,2,3,4,5};

        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Informe o índice da lista que deseja ver: ");
            int num = sc.nextInt();

            System.out.println(lista[num]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Informe um número entre 0 e 4!");
        } catch (InputMismatchException e) {
            System.out.println("Informe um número!");
        }

    }
}
