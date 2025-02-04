public class For24 {
    public static void main(String[] args) {

        System.out.println("Os 10 primeiros dígitos triangulares são: ");

       for (int num = 1; num <=10 ; num++) {
            int triangular = (num * (num + 1)) / 2;
            System.out.println(triangular);
       }
    }

}
