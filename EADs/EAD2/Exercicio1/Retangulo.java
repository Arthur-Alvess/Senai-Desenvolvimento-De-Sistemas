package EADs.EAD2.Exercicio1;

public class Retangulo {
    public double l;
    public double h;


    public Retangulo(double l, double h) {
        this.l = l;
        this.h = h;
    }

    public double areaRetangulo(double l, double h){
        double area = l * h;
        return area;
    }

    public double perimetroRetangulo(double l, double h){
        double perimetro = (l*2) + (h*2);
        return perimetro;
    }

    public double diagonalRetangulo(double l, double h){
        double diagonal = Math.sqrt((l*l) + (h*h));
        return diagonal;
    }
}
