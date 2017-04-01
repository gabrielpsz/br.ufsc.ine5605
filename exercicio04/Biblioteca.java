import java.util.ArrayList;

public class Biblioteca {
    
    private ArrayList<Livro> livros;
    
    public Biblioteca() {
        this.livros = new ArrayList<>();
    }
    
    public void incluirLivro(Livro livro) {
        for (Livro l : this.livros) {
            if (l.getCodigo() != livro.getCodigo() && livro != null) {
                this.livros.add(livro);
                break;
            }
        }
    }
    
    public void excluirLivro(Livro livro) {
        this.livros.remove(livro);
    }
    
}
