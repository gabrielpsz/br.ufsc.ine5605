import java.util.ArrayList;
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
public class ControladorProdutos implements IControladorProdutos {
    
    private ArrayList<IProduto> produtos;
    
    public ControladorProdutos() {
        this.produtos = new ArrayList<IProduto>();
    }
    
    /**
     *
     * @param inflacao percentual de inflacao a ser aplicado sobre o preco de todos os produtos. Exemplo para 10% de inflacao: 10
     */
    public void atualizaPrecos(float inflacao) {
        for (IProduto p : this.produtos) {
            p.setPreco(p.getPreco()*(1+(inflacao/100)));
        }
    }

      /**
     * 
     * @param codigo codigo do produto desejado
     * @return produto encontrado pelo codigo fornecido. Retorna NULL se nenhum produto foi encontrado com o codigo fornecido
     */
    public IProduto getProdutoPeloCodigo(int codigo) {
        for (IProduto p : this.produtos) {
            if (p.getCodigo() == codigo) {
                return p;
            }
        }
        return null;
    }

    /**
     *
     * @param codigo codigo da categoria a ser inserida
     * @param nome nome da categoria a ser inserida
     * @return retorna a categoria que foi inserida
     */
    public ICategoriaProduto incluiCategoriaProduto(int codigo, String nome) {
        ICategoriaProduto categoriaProduto = new CategoriaProduto(codigo, nome);
        return categoriaProduto;
    }

    /**
     *
     * @param codigo codigo do produto a ser inserido
     * @param nome nome do produto a ser inserido
     * @param descricao descricao do produto a ser inserido
     * @param preco preco do produto a ser inserido
     * @param quantidade quantidade em estoque do produto a ser inserido
     * @param categoria referencia para a categoria do produto a ser inserido
     * @return retorna o produto que foi inserido
     */
    public IProduto incluiProduto(int codigo, String nome, String descricao, float preco, int quantidade, CategoriaProduto categoria) {
        IProduto produto = new Produto(categoria, codigo, descricao, nome, preco, quantidade);
        this.produtos.add(produto);
        return produto;
    }
    
}