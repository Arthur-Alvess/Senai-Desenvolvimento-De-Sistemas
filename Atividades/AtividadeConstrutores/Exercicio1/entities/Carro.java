package Exercicio1.entities;

public class Carro {
    private String marca;
    private int ano;

    public Carro(String marca, int ano){
        this.marca = marca;
        this.ano = ano;
    }

    public void showResult(){
        System.out.println("\n--Informações do veículo--\nNome: " + this.marca + "\nAno: " + this.ano);
    }
}
