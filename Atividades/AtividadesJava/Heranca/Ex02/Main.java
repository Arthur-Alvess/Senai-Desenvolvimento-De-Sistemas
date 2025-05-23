package Heranca.Ex02;

import Heranca.Ex02.entities.Bicicleta;
import Heranca.Ex02.entities.Carro;
import Heranca.Ex02.entities.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Veiculo> lista = new ArrayList<>();

        Veiculo veiculo1 = new Veiculo();
        lista.add(veiculo1);
        Veiculo veiculo2 = new Carro();
        lista.add(veiculo2);
        Veiculo veiculo3 = new Bicicleta();
        lista.add(veiculo3);

        for (var recebe:lista){
            recebe.mover();
        }
    }
}
