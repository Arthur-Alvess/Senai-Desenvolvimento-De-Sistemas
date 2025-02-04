package Exercicios_Laco_For;

public class For14 {
    public static void main(String[] args) {

        boolean ehPrimo = true;

        for (int i = 2; i <=50; i++){
            ehPrimo = true;

            for (int j= 2; j<i; j++){
                if (i%j == 0){
                    ehPrimo =false;
                    break;
                }
            }

            if (ehPrimo){
                System.out.println(i);
            }
        }
    }
}
