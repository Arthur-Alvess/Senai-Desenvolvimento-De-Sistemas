package Revisao_IfElse.Desafios_Jogos;
import java.util.*;
public class Ex5 {
    public static void main(String[] args) {
        Random num = new Random(10 + 1);
        Scanner sc = new Scanner(System.in);
        int tent;

        do {
            System.out.print("\nDigite um número de 1 a 10");
            tent = sc.nextInt();
        }while(tent != num);

    }
}
