package Heranca.Ex03.entities;

public class Gerente extends Funcionario{

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario(double salarioBase){
        salarioBase += 500;
        return salarioBase;
    }
}
