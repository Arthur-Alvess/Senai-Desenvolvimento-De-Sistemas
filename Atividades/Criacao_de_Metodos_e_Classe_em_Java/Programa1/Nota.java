package Criacao_de_Metodos_e_Classe_em_Java.Programa1;

public class Nota {
    public double nota1;
    public double nota2;
    public double nota3;

    public Nota(double nota1, double nota2, double nota3){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String verificadorMaior (double nota1, double nota2, double nota3){
        String maior;
        if (nota1 > nota2 && nota1 > nota3){
            maior = "A maior nota é " + nota1;
        } else if (nota2 > nota1 && nota2 > nota3) {
            maior = "A maior nota é " + nota2;
        } else {
            maior = "A maior nota é " + nota3;
        }

        return maior;
    }

    public String verificadorMenor (double nota1, double nota2, double nota3){
        String menor;
        if (nota1 < nota2 && nota1 < nota3){
            menor = "A menor nota é " + nota1;
        } else if (nota2 < nota1 && nota2 < nota3) {
            menor = "A menor nota é " + nota2;
        } else {
            menor = "A menor nota é " + nota3;
        }
        return menor;
    }
}
