public class For30 {
    public static void main(String[] args) {
        int [] num = {32, 87, 14, 59, 73, 48, 17, 36};

        int quantPar = 0, quantImpar = 0;

        for (int i = 0; i < num.length; i++){
            if (num[i] % 2 == 0) {
                quantPar++;
            }else{
                quantImpar++;
            }
        }
        System.out.printf("\nA quantidade de números pares no vetor é: %d", quantPar);
        System.out.printf("\nA quantidade de números ímpares no vetor é: %d", quantImpar);
    }
}
