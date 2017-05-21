/*
 * Universidade Federal de Santa Catarina.
 * CTC - Centro Tecnologico - http://ctc.ufsc.br
 * INE - Departamento de Informatica e Estatistica - http://inf.ufsc.br
 */

/**
 *
 * @author Jean Hauck <jean.hauck at ufsc.br>
 * @date   08/09/2015
 */
public class Produto implements IProduto {
    
    private CategoriaProduto categoria;
    private int codigo;
    private String descricao;
    private String nome;
    private float preco;
    private int quantidade;
    
    public Produto(CategoriaProduto categoria, int codigo, String descricao, String nome, float preco, int quantidade) {
        this.categoria = categoria;
        this.codigo = codigo;
        this.descricao = descricao;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    public CategoriaProduto getCategoria() {
        return this.categoria;
    }
    public int getCodigo() {
        return this.codigo;
    }
    public String getDescricao() {
        return this.descricao;
    }
    public String getNome() {
        return this.nome;
    }
    public float getPreco() {
        return this.preco;
    }
    public int getQuantidade() {
        return this.quantidade;
    }
    public void setCategoria(CategoriaProduto categoria) {
        this.categoria = categoria;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
}