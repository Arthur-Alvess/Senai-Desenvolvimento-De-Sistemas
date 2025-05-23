package Criacao_de_Metodos_e_Classe_em_Java.Programa4;

public class Numeros {
    private int num1;
    private int num2;

    public Numeros(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public String verificadorMaiorQueODobro(int num1, int num2){
        String result;

        if (num1 > (num2 * 2)){
            result = "\n" + num1 + " é maior que o dobro de " + num2 + " que é " + num2*2;
        } else {
            result = "\n" + num1 + " é não é maior que o dobro de " + num2 + " que é " + num2*2;
        }

        return result;
    }
}
