package Models;

public class Triangulo {
    public double a;
    public double b;
    public double c;

    public Triangulo (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void VerificarMaior(Triangulo TrianguloX, Triangulo TrianguloY){
        System.out.println("Área Triângulo X: " + TrianguloX.area());
        System.out.println("Área Triângulo Y: " + TrianguloY.area());

        System.out.println((TrianguloX.area() > TrianguloY.area())? "O triângulo com MAIOR área é o triângulo X!":(TrianguloY.area() > TrianguloX.area())? "O triângulo com maior área é o triângulo Y!" : "A área dos dois triângulos são iguais!");

    }

}
