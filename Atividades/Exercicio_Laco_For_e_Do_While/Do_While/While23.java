package Exercicio_Laco_For_e_Do_While.Do_While;

public class While23 {
    public static void main(String[] args) {
        int num = 1;
        int cont = 1;

        do {
            int triangular = (num * (num + 1)) / 2;
            System.out.println(triangular);
            num++;
            cont++;
        }while(cont<=10);
    }
}
