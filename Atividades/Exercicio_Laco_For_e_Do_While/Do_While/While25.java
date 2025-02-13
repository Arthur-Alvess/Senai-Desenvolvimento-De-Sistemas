package Exercicio_Laco_For_e_Do_While.Do_While;

public class While25 {
    public static void main(String[] args) {
        int base = 5; 
        int i = 1;  

        do {
            int j = 1;
            do {
                System.out.print(j + " ");
                j++;
            } while (j <= i); 

            System.out.println(); 
            i++; 
        } while (i <= base);

    }
}
