package Exercicio_Laco_For_e_Do_While;

public class While6 {
    public static void main(String[] args) {
        int cont = 1;
        int soma = 0;

        do{
            soma+= cont;
            cont++;
        }while(cont <= 50);
        System.out.println("A doma dos números de 1 a 50 é : "+ soma);
    }

}
