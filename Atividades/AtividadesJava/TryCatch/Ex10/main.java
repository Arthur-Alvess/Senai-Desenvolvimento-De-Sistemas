package Ex10;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite um número para calcular o fatorial: ");
            int num = sc.nextInt();
            if (num < 0) {
                throw new NumeroNegativoException("Número não pode ser negativo!");
            }
            if (num > 20) {
                throw new LimiteFatorialExcedidoException("Número excede o limite para cálculo de fatorial!");
            }
            System.out.println("Fatorial de " + num + ": " + calcularFatorial(num));
        } catch (NumeroNegativoException | LimiteFatorialExcedidoException ex) {
            System.out.println("Erro: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Erro: Entrada inválida!");
        }
    }

    public static long calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calcularFatorial(n - 1);
    }
}
