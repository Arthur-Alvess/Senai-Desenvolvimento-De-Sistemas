package Criacao_de_Metodos_e_Classe_em_Java.Programa1;

public class Nota {
    private double nota1;
    private double nota2;
    private double nota3;

    public Nota(double nota1, double nota2, double nota3){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    private double verificadorMaior (){
        double maior;
        if (nota1 > nota2 && nota1 > nota3){
            maior = nota1;
        } else if (nota2 > nota1 && nota2 > nota3) {
            maior = nota2;
        } else {
            maior = nota3;
        }

        return maior;
    }

    private double verificadorMenor (){
        double menor;
        if (nota1 < nota2 && nota1 < nota3){
            menor = nota1;
        } else if (nota2 < nota1 && nota2 < nota3) {
            menor = nota2;
        } else {
            menor = nota3;
        }
        return menor;
    }

    public void showResult(){
        System.out.println("A maior nota é: " + verificadorMaior());
        System.out.println("A menor nota é: " + verificadorMenor());
    }
}
