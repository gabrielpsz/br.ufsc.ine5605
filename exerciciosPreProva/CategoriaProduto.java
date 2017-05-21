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
public class CategoriaProduto implements ICategoriaProduto {
    
    private String nome;
    private int codigo;
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public CategoriaProduto(int codigo, String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}