package Revisão_Math_e_Expressões_Aritimeticas.MathPow;

public class MathPow {
    public static void main(String[] args) {
        double [][] num = {{2,3},{5,2},{10,0},{3,4},{7,2},{2,10},{0.5,2},{1,100},{4,0.5},{-2,3}, {6,3},{8,2},{-3,2},{9,0.5},{2,-3},{0.1,2},{100,0.5},{10,-2},{-1,3},{0,5}};

        for (int i =0; i < num.length; i++){
            double base = num[i][0];
            double expoente = num[i][1];
            double resultado = Math.pow(base, expoente);
            System.out.printf("%d. %.3f^%.3f = %.3f\n", i + 1, base, expoente, resultado);
        }
    }
}
