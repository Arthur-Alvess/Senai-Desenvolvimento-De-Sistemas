package Heranca.Ex04;

import Heranca.Ex04.entities.Pagamento;
import Heranca.Ex04.entities.PagamentoCartao;
import Heranca.Ex04.entities.PagamentoDinheiro;

import java.awt.*;
import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Pagamento pagar = new Pagamento();
        PagamentoCartao pagarCartao = new PagamentoCartao();
        PagamentoDinheiro pagarDinheiro = new PagamentoDinheiro();

        Pagamento[] pagamentos = {pagar, pagarCartao, pagarDinheiro};

        for (var recebe : pagamentos){
            recebe.realizarPagamento();
        }
    }
}
