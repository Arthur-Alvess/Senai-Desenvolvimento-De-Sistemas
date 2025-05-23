package Criacao_de_Metodos_e_Classe_em_Java.Programa3;

public class Alturas {
    public double h;

    public Alturas(double h){
        this.h = h;
    }

    public String classificacaoAltura(double altura){
        String classificacao;

        if (altura < 1.70) {
            classificacao = "\nVocê é baixo";
        } else if (altura < 1.80) {
            classificacao = "\nVocê é mediano";
        } else {
            classificacao = "\nVocê é alto";
        }

        return classificacao;
    }
}
