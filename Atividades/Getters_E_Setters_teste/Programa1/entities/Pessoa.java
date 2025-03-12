package Getters_E_Setters_teste.Programa1.entities;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(){
        this.nome = nome;
        this.idade = idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public  int getIdade(){
        return this.idade;
    }
    public void Apresentar(){
        System.out.println("Nome: " + getNome() + " idade: " + getIdade());
    }
}
