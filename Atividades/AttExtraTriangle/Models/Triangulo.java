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

    public static String VerificarMaior(Triangulo TrianguloX, Triangulo TrianguloY){
        System.out.println("Área Triângulo X: " + TrianguloX.area());
        System.out.println("Área Triângulo Y: " + TrianguloY.area());

        String maior;

        if (TrianguloX.area() > TrianguloY.area()){
            maior = "O triângulo com maior área é o triângulo X!";
        } else if (TrianguloY.area() > TrianguloX.area()){
            maior = "O triângulo com maior área é o triângulo Y!";
        } else {
            maior = "A área dos dois triângulos são iguais!";
        }
        return maior;
    }

}
