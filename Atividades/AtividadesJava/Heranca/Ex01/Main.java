package Heranca.Ex01;

import Heranca.Ex01.entities.Animais;
import Heranca.Ex01.entities.Cachorro;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Thor");
        System.out.println(cachorro.fazerSom());
    }
}
