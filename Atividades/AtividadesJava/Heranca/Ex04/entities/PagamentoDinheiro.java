package Heranca.Ex04.entities;

public class PagamentoDinheiro extends Pagamento{

    @Override
    public void realizarPagamento(){
        System.out.println("Pagamento em Dinheiro Recebido");
    }
}
