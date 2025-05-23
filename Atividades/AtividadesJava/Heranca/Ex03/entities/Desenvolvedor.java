package Heranca.Ex03.entities;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, float salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public float calcularSalario(float salarioBase){
        salarioBase *= 1.1;
        return salarioBase;
    }
}
