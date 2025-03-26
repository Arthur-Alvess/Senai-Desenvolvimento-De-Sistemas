package Heranca.Ex01.entities;

public class Cachorro extends Animais{

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public String fazerSom(){
        return "O cachorro late";
    }
    public void nascer(){
        System.out.println("nasci");
    }
}
