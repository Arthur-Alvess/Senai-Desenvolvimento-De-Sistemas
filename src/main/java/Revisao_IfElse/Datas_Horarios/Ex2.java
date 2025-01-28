package Revisao_IfElse.Datas_Horarios;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um mês em número: ");
        int mes = sc.nextInt();

        if (mes > 12 && mes > 0){
            System.out.println("\nMês inválido");
        }else{
            System.out.println("\nMês válido");
        }
    }
}
