package Criacao_de_Metodos_e_Classe_em_Java.ProgramaDocumento7;

public class Maior {
    private int a;
    private int b;
    private int c;

    public Maior(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private int verificadorMaior(){
        int maior;

        if (a>b && a>c) {
            maior = a; 
        } else if (b>a && b>c) {
            maior = b;
        } else {
            maior = c;
        }
        return maior;
    }

    public void showResult(){
        System.out.println("Maior número informado: " + verificadorMaior());
    }

}
