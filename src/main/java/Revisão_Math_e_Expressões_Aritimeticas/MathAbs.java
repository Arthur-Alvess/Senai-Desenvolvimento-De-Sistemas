package Revisão_Math_e_Expressões_Aritimeticas;

public class MathAbs {
    public static void main(String[] args) {
        double [] num = {-10, 15, 0, -5.5, -100, -0.1, -1234, 3.1415, -999,
        -1, -25, 50, -0.5, -2.718, -777, -100000, -0.0001, 42, -8.8, -500};
    
        for (int i =0; i < num.length; i++){
                double result = Math.abs(num[i]);
                System.out.printf("%d. |%.3f| = %.3f\n", i + 1, num[i], result);        
        }
    }
}
    


