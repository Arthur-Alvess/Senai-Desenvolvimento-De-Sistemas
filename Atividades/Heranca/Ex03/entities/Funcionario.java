package Heranca.Ex03.entities;

public class Funcionario {
    private String nome;
    private float salarioBase;

    public Funcionario(String nome, float salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public float calcularSalario(float salarioBase){
        return this.salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public float getSalarioBase() {
        return salarioBase;
    }
}
