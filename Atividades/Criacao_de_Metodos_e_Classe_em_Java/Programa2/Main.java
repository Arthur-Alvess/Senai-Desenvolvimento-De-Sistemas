package Criacao_de_Metodos_e_Classe_em_Java.Programa2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a placa do veículo: ");
        String numPlaca = sc.nextLine();

        char ultimoNum = numPlaca.charAt(numPlaca.length()-1);
        int finalPlaca = Character.getNumericValue(ultimoNum);

        Placas placa = new Placas(finalPlaca);

        System.out.println(placa.verificadorParOuImpar(finalPlaca));

    }
}
