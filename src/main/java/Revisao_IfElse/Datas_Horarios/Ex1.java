package Revisao_IfElse.Datas_Horarios;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe uma hora: ");
        int hora = sc.nextInt();

        if (hora > 24){
            System.out.println("\nHora inválida");
        }else{
            System.out.println("\nHora válida.");
        }
    }
}
