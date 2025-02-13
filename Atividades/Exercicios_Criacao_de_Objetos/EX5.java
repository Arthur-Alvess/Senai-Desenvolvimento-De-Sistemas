package Exercicios_Criacao_de_Objetos;

import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu número de qualificação: ");
        int classificacao = sc.nextInt();

        String tipo = verificadorClassificacao(classificacao);

        System.out.println(tipo);
        sc.close();
    }

    public static String verificadorClassificacao(int a){
        String txt;
        if (a >=1 && a <= 10){
            txt = "\nFaixa de Classificação = A";
        } else if (a > 10 && a <= 20){
            txt = "\nFaixa de Classificação = B";
        } else if (a > 20 && a <= 30){
            txt = "\nFaixa de Classificação = C";
        }else {
            txt = "\nNúmero informado não é referente à nenhuma Faixa de Classificação";
        }
        return txt;
    }
}
