package EADs.EAD2.Exercicio1;

public class Retangulo {
    public double base;
    public double altura;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double areaRetangulo(){
        return base * altura;
    }

    public double perimetroRetangulo(){
        return 2 * (base + altura);
    }

    public double diagonalRetangulo(){
        return Math.sqrt(altura * altura + base * base);
    }

    public void showResult(){
        System.out.println("\nAREA = " + areaRetangulo());
        System.out.println("PERIMETRO = " + perimetroRetangulo());
        System.out.println("DIAGONAL = "+ diagonalRetangulo());
    }
}
