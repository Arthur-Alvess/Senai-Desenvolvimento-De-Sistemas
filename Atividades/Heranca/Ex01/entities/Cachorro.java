package Heranca.Ex01.entities;

public class Cachorro extends Animais{

    @Override
    public String fazerSom(){
        return "O cachorro late";
    }
    public void nascer(){
        System.out.println("nasci");
    }
}
