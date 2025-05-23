package Exercicio_Laco_For_e_Do_While.Do_While;

import java.util.Scanner;

public class While20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senhacorreta = "Ar248015th";

        String tent = "";

        do {
            System.out.print("Informe a senha: ");
            tent = sc.nextLine();

        }while(!tent.equals(senhacorreta));

        sc.close();
    }
}
