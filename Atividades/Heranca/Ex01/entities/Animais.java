package Heranca.Ex01.entities;

public class Animais {
    private String nome;

    public Animais(String nome) {
        this.nome = nome;
    }

    public String fazerSom(){
        return "Som genérico de animal";
    }
    public void morrer(){
        System.out.println("morri");
    }
}
