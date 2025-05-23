package Exercicio_Laco_For_e_Do_While.Do_While;

public class While21 {
    public static void main(String[] args) {
        int cont = 0;
        int num =1;
        do {
            int soma = 0;
            for (int i = 1; i<= num/2; i++){
                if (num % i == 0) {
                    soma += i;
                }
            }
            if (soma == num){
                System.out.println(num);
                cont ++;
            }
            num++;
        }while(cont < 10);
    }
}
