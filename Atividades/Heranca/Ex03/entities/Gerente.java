package Heranca.Ex03.entities;

public class Gerente extends Funcionario{

    public Gerente(String nome, float salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public float calcularSalario(float salarioBase){
        salarioBase += 500;
        return salarioBase;
    }
}
