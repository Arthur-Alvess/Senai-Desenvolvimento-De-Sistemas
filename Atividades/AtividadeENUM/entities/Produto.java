package AtividadeENUM.entities;

public class Produto {
    private int produtoID;
    private String descricao;
    private double valor;

    public Produto(int produtoID, String descricao, double valor){
        this.produtoID = produtoID;
        this.descricao = descricao;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public int getProdutoID() {
        return produtoID;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "\n" +
                "ProdutoID = " + produtoID +
                ", Nome = '" + descricao + '\'' +
                ", Valor =  R$" + valor;
    }
}
