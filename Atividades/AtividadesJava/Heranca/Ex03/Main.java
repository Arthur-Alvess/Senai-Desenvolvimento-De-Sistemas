package Heranca.Ex03;

import Heranca.Ex03.entities.Desenvolvedor;
import Heranca.Ex03.entities.Funcionario;
import Heranca.Ex03.entities.Gerente;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Arthur", 1000);
        Gerente gerente = new Gerente("Marzano", 2000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Gabriel", 1500);

        System.out.println(funcionario.calcularSalario(funcionario.getSalarioBase()));
        System.out.println(gerente.calcularSalario(gerente.getSalarioBase()));
        System.out.println(desenvolvedor.calcularSalario(desenvolvedor.getSalarioBase()));
    }
}
