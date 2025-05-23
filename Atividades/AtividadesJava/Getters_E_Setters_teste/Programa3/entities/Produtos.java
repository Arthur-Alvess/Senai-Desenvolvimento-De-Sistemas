package Getters_E_Setters_teste.Programa3.entities;

public class Produtos {
    private String nome;
    private double preco;
    private int quantEstoque;
    private int quantAdd;
    private int quantRemove;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        }
    }

    public int getQuantEstoque() {
        return quantEstoque;
    }

    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }

    public int getQuantAdd() {
        return quantAdd;
    }

    public void setQuantAdd(int quantAdd) {
        this.quantAdd = quantAdd;
    }

    public int getQuantRemove() {
        return quantRemove;
    }

    public void setQuantRemove(int quantRemove) {
        this.quantRemove = quantRemove;
    }

    public int addQuant (int quantEstoque, int quantAdd){
        return quantEstoque + quantAdd;
    }

    public int removeQuant(int quantEstoque, int quantRemove){
        return quantEstoque - quantRemove;
    }
}
