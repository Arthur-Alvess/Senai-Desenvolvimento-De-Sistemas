package AprendendoPOO.Program1.Models;
import java.util.*;

public class Estoque {
    List<Livros> livro;


    public Estoque(){
        livro = new ArrayList<>();
    }

    public void adicionarLivros(Livros livro, int quant){

        this.livro.add(livro);
    }

    public void removerLivros(Livros livro, int quant){
        this.livro.remove(livro);
    }
}
