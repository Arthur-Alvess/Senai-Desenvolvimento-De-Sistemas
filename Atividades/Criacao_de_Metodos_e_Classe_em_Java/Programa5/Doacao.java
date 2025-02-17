package Criacao_de_Metodos_e_Classe_em_Java.Programa5;

public class Doacao {
    private int idade;
    private double peso;

    public Doacao (int idade, double peso){
        this.idade = idade;
        this.peso = peso;
    }

    public String verificadorPodeDoar(int idade, double peso){
        String result;

        if (idade > 18 && idade < 65 && this.peso >= 50){
            result = "\nPode soar sangue!";
        }else {
            result = "\nNão pode doar sangue!";
        }

        return result;
    }
}
