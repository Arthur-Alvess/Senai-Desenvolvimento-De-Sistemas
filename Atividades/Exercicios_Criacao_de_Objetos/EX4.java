package Exercicios_Criacao_de_Objetos;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe uma palavra: ");
        String palavra = sc.nextLine();

        String tam = verificador5ouMaiscaracteres(palavra);

        System.out.println(tam);
    }

    public static String verificador5ouMaiscaracteres(String a){
        String txt;
        if (a.length() > 5){
            txt = "\nA palavra informada contém mais de 5 caracteres";
        }else {
            txt = "\nA palavra informada contém menos ou exatamente 5 caracteres";
        }
        return txt;
    }
}
