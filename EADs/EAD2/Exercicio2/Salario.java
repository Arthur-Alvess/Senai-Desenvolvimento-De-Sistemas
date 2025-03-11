package EADs.EAD2.Exercicio2;

public class Salario {
    public double salBruto;
    public double tax;

    public Salario(double salBruto, double tax) {
        this.salBruto = salBruto;
        this.tax = tax;
    }

    public double salLiquido() {
        return salBruto - tax;
    }

    public double novoSalario(double porcentagem) {
        return salBruto * (1 + (porcentagem / 100));
    }
}
