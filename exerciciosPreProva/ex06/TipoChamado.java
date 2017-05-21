/*
 * Universidade Federal de Santa Catarina.
 * CTC - Centro Tecnologico - http://ctc.ufsc.br
 * INE - Departamento de Informatica e Estatistica - http://inf.ufsc.br
 */

/**
 *
 * @author Jean Hauck <jean.hauck at ufsc.br>
 * @date 11/04/2016
 */
public class TipoChamado implements ITipoChamado {
    
    private int codigo;
    private String descricao;
    private String nome;
    
    public TipoChamado(int codigo, String descricao, String nome) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.nome = nome;
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
    
}