package Exercicio2.entities;

public class Pessoa {
    private String nome;
    private String idade;

    public Pessoa (String nome, String idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa (){
        this.nome = "Desconhecido";
        this.idade = "0";
    }

    public void showResult(){
        System.out.print("\nNome: " + this.nome + "\nIdade: " + this.idade);
    }
}
