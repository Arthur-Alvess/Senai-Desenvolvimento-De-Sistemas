package EADs.EAD2.Exercicio2;

public class Salario {
    public double salBruto;
    public double tax;
    public double aumento;

    public Salario(double salBruto, double tax) {
        this.salBruto = salBruto;
        this.tax = tax;
    }

    public double salarioLiquido(double salBruto, double tax){
        double salLiquido = salBruto - tax;
        return salLiquido;
    }

    public double novoSalario(double porcentagem){
        return salBruto * (1 + (porcentagem/100));
    }
}
