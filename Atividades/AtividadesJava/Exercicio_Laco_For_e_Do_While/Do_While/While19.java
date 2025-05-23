package Exercicio_Laco_For_e_Do_While.Do_While;

import java.util.Random;

public class While19 {
    public static void main(String[] args) {
        Random random = new Random();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder senha = new StringBuilder();
        int tam = 6;
        int i = 0;

        do {
            int index = random.nextInt(characters.length());
            senha.append(characters.charAt(index));
            i++;
        } while (i < tam);

        System.out.println("Senha gerada: " + senha.toString());
    }
}
