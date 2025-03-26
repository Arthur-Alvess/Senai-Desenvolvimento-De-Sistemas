package Heranca.Ex03.entities;

public class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario(double salarioBase){
        return this.salarioBase;
    }
}
