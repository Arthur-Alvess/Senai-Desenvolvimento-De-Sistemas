package Criacao_de_Metodos_e_Classe_em_Java.Programa2;

public class Placas {
    private int finalPlaca;

    public Placas(int finalPlaca){
        this.finalPlaca = finalPlaca;
    }

    public String verificadorParOuImpar(int finalPlaca){
        String result;

        if (finalPlaca % 2 == 0){
            result = "Placa com final Par!";
        } else {
            result = "Placa com final Ímpar";
        }

        return result;
    }
}
