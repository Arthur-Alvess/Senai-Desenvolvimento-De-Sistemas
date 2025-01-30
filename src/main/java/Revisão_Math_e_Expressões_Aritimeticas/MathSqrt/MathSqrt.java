package Revisão_Math_e_Expressões_Aritimeticas.MathSqrt;

public class MathSqrt {
    public static void main(String[] args) {
        double [] num = {16, 81, 2, 0, 144, 225, 0.25, 1, 10, 400, 0.04, 121, 625, 50, 900, 10000, 0.001, 36, 49, 169};

        for (int i=0; i< num.length; i++){

            double resultado = Math.sqrt(num[i]);

            if (i == 2 || i == 13){
                System.out.printf("\nRaiz quadrada de " + num[i] + " é igual a %.2f", resultado);
            } else if (i == 8){
                System.out.printf("\nRaiz quadrada de " + num[i] + " é igual a %.1f", resultado);
            } else if (i == 16){
                System.out.printf("\nRaiz quadrada de " + num[i] + " é igual a %.3f", resultado);
            } else {
                System.out.printf("\nRaiz quadrada de " + num[i] + " é igual a " + resultado);
            }
        }
    }
}
